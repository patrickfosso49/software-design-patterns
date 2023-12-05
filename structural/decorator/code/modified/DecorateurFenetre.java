package structural.decorator.code.modified;

public abstract class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetre;

    DecorateurFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
}
