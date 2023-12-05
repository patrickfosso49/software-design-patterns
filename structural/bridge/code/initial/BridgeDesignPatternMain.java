package structural.bridge.code.initial;

public class BridgeDesignPatternMain {

    public static void main(String[] args) {

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();
        System.out.println("--------------------------------------------------");

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();
    }
}
