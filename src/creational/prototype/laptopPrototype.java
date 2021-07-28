package creational.prototype;

public class laptopPrototype implements Cloneable{
    String processor;
    int storage;
    int ram;

    public laptopPrototype(String processor, int storage, int ram) {
        this.processor = processor;
        this.storage = storage;
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void addRam(int ram){
        this.ram+=ram;
    }
    @Override
    public String toString() {
        return "laptopPrototype{" +
                "processor='" + processor + '\'' +
                ", storage=" + storage +
                ", ram=" + ram +
                '}';
    }
    @Override
    protected laptopPrototype clone() throws CloneNotSupportedException {
        return (laptopPrototype) super.clone();
    }
}
