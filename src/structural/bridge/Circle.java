package structural.bridge;

public class Circle extends Shape{
    Circle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle drawn:"+color.fill();
    }
}
