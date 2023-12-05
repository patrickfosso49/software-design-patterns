package structural.decorator.code.initial;

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

    public void dessinerCurseurVertical() {
        System.out.println("Dessin du curseur vertical");
    }

}
