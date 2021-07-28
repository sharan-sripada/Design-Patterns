package creational.singleton;
import java.util.*;
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Value 0f 1: "+singleton1.getValue());
        System.out.println("Value 0f 2: "+singleton2.getValue());

        singleton1.setValue("Bye");

        System.out.println("Value 0f 1: "+singleton1.getValue());
        System.out.println("Value 0f 2: "+singleton2.getValue());


    }
}
