package creational.factory.fouotsop_fosso_patrick_20U2585.code.modified.factory;

public class ProduitFactory1 extends ProduitFactory {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
    
}
