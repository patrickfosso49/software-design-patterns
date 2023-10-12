package creational.builder.code.modified;

public class MonteurPizzaLocal extends MonteurPizza{

    @Override
    public void monterPate() {
        pizza.setPate("feuille de macabo");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("escargo");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("sauce jaune");
    }
    
}
