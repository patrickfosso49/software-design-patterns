package creational.factory.fouotsop_fosso_patrick_20U2585.code.initial.factorymethod;

public class Client {
    
    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA = produitFactory.getProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();


        produitA = produitFactory.getProduitA(3);

    }
}