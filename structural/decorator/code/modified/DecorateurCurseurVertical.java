package structural.decorator.code.modified;

public class DecorateurCurseurVertical extends DecorateurFenetre {

    DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        fenetre.dessiner();
        System.out.println("Fenetre, decore avec curseur vertical");
    }

    @Override
    public void decrire() {
        fenetre.decrire();
        System.out.println("Je suis une fenetre simple avec curseur vertical");
    }

}
