package lesson18.Theory.exercise2;

/**
 * Created by Ruslan on 11.05.2018.
 */
public class Converter {
    public static void main(String[] args) {
        System.out.println(intToString(111231));
        System.out.println(stringToInt("asd"));

        System.out.println(stringToInt("1050a"));
    }

    public static String intToString(int input) {
        return String.valueOf(input);
    }

    public static int stringToInt(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException | ClassCastException e) {
            System.out.println(input + " can not be converted to int");
            return 0;
        }

    }
}
