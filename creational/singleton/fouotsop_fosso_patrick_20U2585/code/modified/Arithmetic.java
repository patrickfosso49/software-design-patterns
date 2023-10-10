package creational.singleton.fouotsop_fosso_patrick_20U2585.code.modified;

public class Arithmetic {
    
    private int x;
    private int y;
    private String nom;

    private static Arithmetic instance;
    
    private Arithmetic () {}

    private Arithmetic (int x, int y) {
        this.x = x;
        this.y = y;
    }
    private Arithmetic( int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom = nom;
    }

    public static Arithmetic getInstance () {
        if (instance == null) {
            instance = new Arithmetic();
        } 
        return instance;
    }

    public static Arithmetic getInstance(int x, int y) {
        if (instance == null) {
            instance = new Arithmetic(x, y);
        }
        return instance;
    }

    public static Arithmetic getInstance(int x, int y, String nom) {
        if (instance == null) {
            instance = new Arithmetic(x, y, nom);
        }
        return instance;
    }


    public int somme( int x, int y) {
        return x + y;
    }

    public float moyenne(int x, int y) {
        return somme(x,y)/2;
    }

    public void affiche() {
        System.out.println("\nJe suis une instance mes valuers sont : x = " + this.x + " ,y = " + this.y + " et nom = " + this.nom);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
