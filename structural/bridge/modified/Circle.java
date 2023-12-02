package structural.bridge.modified;

public class Circle extends Shape {
    Circle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.println("Circle filled with");
        color.fillColor();
    }

}
