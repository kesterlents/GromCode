package lesson10.PolyExample;

/**
 * Created by Ruslan on 26.03.2018.
 */
public class Child extends Human {

    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class is called...");
        super.run();
    }
}
