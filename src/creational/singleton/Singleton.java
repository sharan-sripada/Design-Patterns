package creational.singleton;

public class Singleton {
    private  static Singleton instance;
    private String value="Hello";

    public Singleton() {

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
