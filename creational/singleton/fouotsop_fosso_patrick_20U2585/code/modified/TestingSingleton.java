package creational.singleton.fouotsop_fosso_patrick_20U2585.code.modified;

public class TestingSingleton {
    public static void main(String[] args) {
        int som = Arithmetic.getInstance().somme(2, 5);

        System.out.printf("la somme est %d", som);

        Arithmetic s1 = Arithmetic.getInstance(8, 3);
        s1.affiche();

        Arithmetic s2 = Arithmetic.getInstance(5, 9);
        s2.affiche();

        Arithmetic s3 = Arithmetic.getInstance(3, 4, "addition");
        s3.affiche();
    }

}
