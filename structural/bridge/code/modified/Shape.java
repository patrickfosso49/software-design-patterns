package structural.bridge.code.modified;

public abstract class Shape {

    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
}
