package structural.bridge.code.modified;

public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    public void colorIt() {
        System.out.println("Rectangle filled with");
        color.fillColor();
    }
}
