package creational.abstractfactory.code.modified;

public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }

    @Override
    public ProduitC getProduitC() {
        return new ProduitC1();
    }
    
}
