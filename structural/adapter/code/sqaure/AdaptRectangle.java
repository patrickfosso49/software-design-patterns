package structural.adapter.code.sqaure;

public class AdaptRectangle implements Icarre {

    private Rectangle rectangle;

    AdaptRectangle() {
        this.rectangle = new Rectangle();
    }

    @Override
    public float perimetre() {
        rectangle.setLargeur(0);
        rectangle.setLongeur(0);
        return rectangle.perimetre();
    }

    @Override
    public float aire() {
        rectangle.setLargeur(0);
        rectangle.setLongeur(0);
        return rectangle.aire();
    }

}
