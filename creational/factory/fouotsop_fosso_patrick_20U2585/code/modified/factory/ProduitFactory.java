package creational.factory.fouotsop_fosso_patrick_20U2585.code.modified.factory;

public abstract class ProduitFactory {
    
    public abstract ProduitA getProduitA() {

        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}
