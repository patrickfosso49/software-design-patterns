package creational.factory.code.modified.factory;

public class ProduitFactory3 extends ProduitFactory {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA3();
    }

}
