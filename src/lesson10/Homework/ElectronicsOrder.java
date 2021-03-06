package lesson10.Homework;

import java.util.Date;

/**
 * Created by Ruslan on 02.04.2018.
 */
public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity,
                            String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
       /* String[] cities = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};
        for (String city : cities) {
            if (city.equals(getShipFromCity()) && city.equals(getShipToCity()) && getBasePrice() >= 100 &&
                    getCustomerOwned().getGender().equals("Женский")) {
                setDateConfirmed(new Date());
            }
        }
    }*/
        if (getCustomerOwned() == null || getCustomerOwned().getName() == null)
            return;

        String[] citiesFromCity = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};
        String[] citiesToCity = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};
        int i = 0;
        for (String city : citiesFromCity) {
            if (city == getShipFromCity()) {
                break;
            } else if (i != 3) {
                i++;
                continue;
            } else return;
        }
        int j = 0;
        for (String city2 : citiesToCity) {
            if (city2 == getShipToCity()) {
                break;
            } else if (j != 3) {
                j++;
                continue;
            } else return;
        }
        if (getBasePrice() >= 100 && getCustomerOwned().getGender().equals("Женский")) {
            setDateConfirmed(new Date());
        }
    }


    /*
    Цена состоит из цены товара + цена за доставку. Есть скидки. Если доставка в любой город кроме, Киева и Одессы, то
    цена за доставку равна 15 % от суммы заказа. В других случаях равна 10 %. Так же, если цена заказа больше 1000,
    то скидка на заказ равна 5 % после оплаты комиссии за доставку.
1. Если городом доставки Киев или Одесса, то цена за доставку равно 10 % от цены товара. В других случаях равно 15 %.
2. Если цена за товар больше 1000, то тогда итоговая сумма состоит из цены заказа с 5-процентной скидкой и цены доставки.
В других случаях - без скидки.

    */
    @Override
    public void calculatePrice() {
        if (getShipToCity() == null || getBasePrice() <= 0)
            return;

        if ((getShipToCity() == "Киев") || getShipToCity() == "Одесса") {
            setTotalPrice(0.1 * getBasePrice());
        } else {
            setTotalPrice(0.15 * getBasePrice());
        }

        if (getBasePrice() > 1000) {
            setTotalPrice(0.95 * (getBasePrice() + getTotalPrice()));
        } else setTotalPrice(getBasePrice() + getTotalPrice());

    }
}
