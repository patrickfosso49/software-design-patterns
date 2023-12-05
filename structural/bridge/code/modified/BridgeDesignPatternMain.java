package structural.bridge.code.modified;

public class BridgeDesignPatternMain {

    public static void main(String[] args) {

        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();
        System.out.println("--------------------------------------------------");

        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();
        System.out.println("--------------------------------------------------");

        Shape s3 = new Triangle(new OrangeColor());
        s3.colorIt();
    }
}