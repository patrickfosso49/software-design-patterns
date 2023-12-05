package structural.decorator.code.modified;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

    DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        fenetre.dessiner();
        System.out.println("Fenetre, decore avec curseur Horizontal");
    }

    @Override
    public void decrire() {
        fenetre.decrire();
        System.out.println("Je suis une fenetre simple avec curseur Horizontal");
    }

}
