package structural.decorator.code.initial;

public abstract class DecorateurFenetre implements Fenetre {

    protected Fenetre fenetre;

    DecorateurFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
}
