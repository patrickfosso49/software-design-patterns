package structural.decorator.code.initial;

public class FenetreSimple implements Fenetre {

    @Override
    public void dessiner() {
        System.out.println("Fenetre simple");
    }

    @Override
    public void decrire() {
        System.out.println("Je suis une fenetre simple");
    }

}
