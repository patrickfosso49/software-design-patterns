package structural.decorator.code.modified;

public class DecorateurZoomOut extends DecorateurFenetre {
    DecorateurZoomOut(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        fenetre.dessiner();
        System.out.println("Fenetre, decore avec ZoomOut");
    }

    @Override
    public void decrire() {
        fenetre.decrire();
        System.out.println("Je suis une fenetre simple avec ZoomOut");
    }

}
