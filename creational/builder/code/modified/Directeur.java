package creational.builder.code.modified;

public class Directeur {
    
    private MonteurPizza monteurAbstrait;
   
    Directeur (MonteurPizza monteurPizza) {
        monteurAbstrait = monteurPizza;
    }
    
    public void Construire() {

        monteurAbstrait.creerNouvellePizza();
        monteurAbstrait.monterPate();
        monteurAbstrait.monterGarniture();
        monteurAbstrait.monterSauce();
        monteurAbstrait.getPizza().print();
    }

    public void setMonteurPizza(MonteurPizza monteurPizza) {
        this.monteurAbstrait = monteurPizza;
    }
}
