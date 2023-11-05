package structural.composite.code.file;

public abstract class Repertoire {

    private final String nom;

    private final String type;

    abstract void decrire();

    abstract void supprimer();

    Repertoire(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

}
