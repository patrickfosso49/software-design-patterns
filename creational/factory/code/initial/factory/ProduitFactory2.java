package creational.factory.code.initial.factory;

public class ProduitFactory2 extends ProduitFactory {

    @Override
    protected ProduitA createProduitA() {
        return new ProduitA2();
    }

}
