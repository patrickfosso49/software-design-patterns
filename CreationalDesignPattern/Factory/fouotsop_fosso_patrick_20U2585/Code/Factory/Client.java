package CreationalDesignPattern.Factory.fouotsop_fosso_patrick_20U2585.Code.Factory;

public class Client {
   
    public static void main(String[] args) {
        ProduitFactoryA1 produitFactoryA1 = new ProduitFactoryA1();
        ProduitFactoryA2 produitFactoryA2 = new ProduitFactoryA2();
        ProduitFactoryA3 produitFactoryA3 = new ProduitFactoryA3();

        ProduitA produitA = null;

        produitA = produitFactoryA1.getProduitA();
        produitA.methodeA();

        produitA = produitFactoryA2.getProduitA();
        produitA.methodeA();

        produitA = produitFactoryA3.getProduitA();
        produitA.methodeA();
    }
}
