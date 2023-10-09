package creational.factory.fouotsop_fosso_patrick_20U2585.code.initial.factory;

public abstract class ProduitFactory {

    public ProduitA getProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
