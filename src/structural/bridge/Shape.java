package structural.bridge;

public abstract class Shape {
    protected Color color;
    Shape(Color color){
        this.color=color;
    }
    abstract public String draw();
}
