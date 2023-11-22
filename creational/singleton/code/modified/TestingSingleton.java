package creational.singleton.code.modified;

public class TestingSingleton {
    public static void main(String[] args) {
        int som = Arithmetic.getInstance().somme(2, 5);
        int difference = Arithmetic.getInstance().soustraction(2, 5);
        int product = Arithmetic.getInstance().multiplication(2, 5);
        float average = Arithmetic.getInstance().moyenne(2, 5);

        System.out.printf("la somme est %d\n", som);
        System.out.printf("la difference est %d\n", difference);
        System.out.printf("le produit est %d\n", product);
        System.out.printf("la somme est %f\n", average);

        Arithmetic s1 = Arithmetic.getInstance(8, 3);
        s1.affiche();

        Arithmetic s2 = Arithmetic.getInstance(5, 9);
        s2.affiche();

        Arithmetic s3 = Arithmetic.getInstance(3, 4, "addition");
        s3.affiche();
    }

}
