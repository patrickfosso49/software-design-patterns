package structural.adapter.code.square;

public class Programme {

    public static void main(String[] args) {

        Icarre icarre = new AdaptRectangle();

        float perimetre = icarre.perimetre(3);
        float aire = icarre.aire(3);

        System.out.println(perimetre);
        System.out.println(aire);
    }
}
