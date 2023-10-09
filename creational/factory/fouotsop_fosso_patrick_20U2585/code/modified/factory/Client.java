package creational.factory.fouotsop_fosso_patrick_20U2585.code.modified.factory;

public class Client {
   
    public static void main(String[] args) {
        ProduitFactory1 produitFactoryA1 = new ProduitFactory1();
        ProduitFactory2 produitFactoryA2 = new ProduitFactory2();
        ProduitFactory3 produitFactoryA3 = new ProduitFactory3();

        ProduitA produitA = null;

        produitA = produitFactoryA1.getProduitA();
        produitA.methodeA();

        produitA = produitFactoryA2.getProduitA();
        produitA.methodeA();

        produitA = produitFactoryA3.getProduitA();
        produitA.methodeA();
    }
}
