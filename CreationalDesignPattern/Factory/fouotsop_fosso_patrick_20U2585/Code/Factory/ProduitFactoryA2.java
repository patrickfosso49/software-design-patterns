package CreationalDesignPattern.Factory.fouotsop_fosso_patrick_20U2585.Code.Factory;

public class ProduitFactoryA2 extends ProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }
    
}
