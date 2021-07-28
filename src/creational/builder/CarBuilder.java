package creational.builder;

public class CarBuilder {
    public String carType;
    public String engine;
    public int seats;
    public String battery;
    public CarBuilder(String carType){
        this.carType=carType;
    }
    public CarBuilder setEngine(String engine){
        this.engine=engine;
        return  this;
    }
    public CarBuilder setBattery(String battery){
        this.battery=battery;
        return  this;
    }
    public CarBuilder setSeats(int seats){
        this.seats=seats;
        return  this;
    }


    public Car build() {
        return new Car(this);
    }
}
