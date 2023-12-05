package structural.bridge.code.modified;

public class Rectangle extends Shape {

    Rectangle(Color color) {
        super(color);
    }

    public void colorIt() {
        System.out.println("Rectangle filled with");
        color.fillColor();
    }
}
