package structural.composite.code.file;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Repertoire {

    private List<Repertoire> children = new ArrayList<>();

    Dossier(String nom, String type) {
        super(nom, type);
    }

    @Override
    void decrire() {
        System.out.println(getNom() + " " + getType());
        for (Repertoire repertoire : children) {
            repertoire.decrire();
        }
    }

    public void ajouter(Repertoire repertoire) {
        this.children.add(repertoire);
    }

    @Override
    public void supprimer() {
        for (Repertoire repertoire : children) {
            repertoire.supprimer();
        }
    }

    public Repertoire obtenir(int i) {
        return children.remove(i);
    }

    public List<Repertoire> getChildren() {
        return children;
    }

    public void setChildren(List<Repertoire> children) {
        this.children = children;
    }

}
