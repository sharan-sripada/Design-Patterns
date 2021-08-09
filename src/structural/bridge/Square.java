package structural.bridge;

public class Square extends Shape{
    Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn:"+color.fill();
    }
}
