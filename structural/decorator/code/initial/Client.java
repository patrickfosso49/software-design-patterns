package structural.decorator.code.initial;

public class Client {

    public static void main(String[] args) {

        FenetreSimple fenetreSimple = new FenetreSimple();
        fenetreSimple.decrire();
        fenetreSimple.dessiner();
        System.out.println("--------------------------------------------------");

        DecorateurCurseurHorizontal decorateurFenetreCurseurHorizontal = new DecorateurCurseurHorizontal(fenetreSimple);
        decorateurFenetreCurseurHorizontal.decrire();
        decorateurFenetreCurseurHorizontal.dessiner();
        decorateurFenetreCurseurHorizontal.dessinerCurseurHorizontal();
        System.out.println("--------------------------------------------------");

        DecorateurCurseurVertical decorateurFenetreCurseurVertical = new DecorateurCurseurVertical(
                decorateurFenetreCurseurHorizontal);
        decorateurFenetreCurseurVertical.decrire();
        decorateurFenetreCurseurVertical.dessiner();
        decorateurFenetreCurseurVertical.dessinerCurseurVertical();
    }

}
