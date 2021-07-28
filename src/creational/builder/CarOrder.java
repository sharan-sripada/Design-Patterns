package creational.builder;

public class CarOrder {
    public static void main(String[] args) {
        Car car1=new CarBuilder("Electrical").setBattery("50kW").setSeats(2).build();
        System.out.println("car1:\n"+car1);
        Car car2=new CarBuilder("Gasoline").setSeats(4).setEngine("V8").build();
        System.out.println("car2:\n"+car2);
    }
}
