package structural.bridge.initial;

public abstract class Shape {
    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void colorIt();
}
