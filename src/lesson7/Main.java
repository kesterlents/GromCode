package lesson7;

import lesson6.Circle;

/**
 * Created by Ruslan on 30.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        // Создаём объект (окружность класса Circle), у неё будет нулевой
        // радиус и центр в (0.0;0.0), поскольку все свойства получат
        // значения по умолчанию
        Circle o1 = new Circle();
        // выводим на экран параметры окружности
        o1.printCircle();
        // Меняем абсциссу центра, обращааясь к свойству x
        o1.x = 3;
        // Меняем радиус, обращааясь к свойству r
        o1.r = 12.3;
        // выводим на экран обновлённые параметры окружности
        o1.printCircle();
        // Создаём другой объект того же класса
        Circle o2 = new Circle();
        o2.r = 3.14;
        o2.zoomCircle(1.66);
        o2.printCircle(); // Окружность с центром (0.0;0.0) и радиусом 5.2124
    }
}
