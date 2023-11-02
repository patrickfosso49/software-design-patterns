package structural.composite.code.text;

public abstract class Texte {

    private String titre;
    private String preambule;

    public abstract int longeur();

    public abstract void ajout(Texte text);

    public abstract void retrait(int index);

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPreambule() {
        return preambule;
    }

    public void setPreambule(String preambule) {
        this.preambule = preambule;
    }
}
