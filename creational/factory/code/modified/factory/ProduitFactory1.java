package creational.factory.code.modified.factory;

public class ProduitFactory1 extends ProduitFactory {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }

}
