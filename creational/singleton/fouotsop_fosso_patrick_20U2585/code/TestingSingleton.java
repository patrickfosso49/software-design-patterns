package creational.singleton.fouotsop_fosso_patrick_20U2585.code;

public class TestingSingleton {
    
    public static void main(String[] args) {
        int som = Singleton.getInstance().somme(2, 5);

        System.out.printf("la somme est %d", som);

        Singleton s1 = Singleton.getInsgance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInsgance(5, 9);
        s2.affiche();
    }
}
