package structural.decorator.code.modified;

public class Client {

    public static void main(String[] args) {

        FenetreSimple fenetreSimple = new FenetreSimple();
        fenetreSimple.decrire();
        fenetreSimple.dessiner();
        System.out.println("--------------------------------------------------");

        DecorateurFenetre decorateurFenetreCurseurHorizontal = new DecorateurCurseurHorizontal(fenetreSimple);
        decorateurFenetreCurseurHorizontal.decrire();
        decorateurFenetreCurseurHorizontal.dessiner();
        System.out.println("--------------------------------------------------");

        DecorateurFenetre decorateurFenetreCurseurVertical = new DecorateurCurseurVertical(
                decorateurFenetreCurseurHorizontal);
        decorateurFenetreCurseurVertical.decrire();
        decorateurFenetreCurseurVertical.dessiner();
        System.out.println("--------------------------------------------------");

        DecorateurFenetre decorateurFenetreZoomout = new DecorateurZoomOut(decorateurFenetreCurseurVertical);
        decorateurFenetreZoomout.decrire();
        decorateurFenetreZoomout.dessiner();
    }

}
