package structural.bridge.code.initial;

public abstract class Shape {
    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
}
