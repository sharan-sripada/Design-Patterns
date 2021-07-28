package creational.singleton;

public enum SingletonEnum {
    INSTANCE;
    //SingletonEnum Instance=new SingletonEnum();
    String value="HELLO";

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
