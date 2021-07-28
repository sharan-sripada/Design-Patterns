package creational.builder;

public class Car {
    private String carType;
    private String engine;
    private int seats;
    private String battery;
    public Car(CarBuilder carBuilder){
        this.carType=carBuilder.carType;
        this.engine=carBuilder.engine;
        this.seats=carBuilder.seats;
        this.battery=carBuilder.battery;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Type: "+carType+"\n");
        builder.append("Engine: "+engine+"\n");
        builder.append("Seats: "+seats+"\n");
        builder.append("Battery: "+battery+"\n");

        return builder.toString();
    }

}
