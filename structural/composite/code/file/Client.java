package structural.composite.code.file;

public class Client {

    public static void main(String[] args) {

        Fichier fichier = new Fichier("file", "texte");

        Dossier dossier = new Dossier("folder", "dossier");

        dossier.ajouter(fichier);
        dossier.decrire();

        dossier.supprimer();

    }

}
