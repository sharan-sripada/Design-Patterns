package creational.singleton;

public class SingletonEnumDemo {
    public static void main(String[] args) {


        SingletonEnum singleton1 = SingletonEnum.INSTANCE;
        SingletonEnum singleton2 = SingletonEnum.INSTANCE;

        System.out.println("Value 0f 1: " + singleton1.getValue());
        System.out.println("Value 0f 2: " + singleton2.getValue());

        singleton1.setValue("Bye");

        System.out.println("Value 0f 1: " + singleton1.getValue());
        System.out.println("Value 0f 2: " + singleton2.getValue());
    }
}
