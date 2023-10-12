package creational.builder.code.initial;

public class Client {
    
    public static void main(String[] args) {
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();

        Directeur directeur = new Directeur(monteurPizzaReine);

        directeur.Construire();
        directeur.setMonteurPizza(monteurPizzaPiquante);
        directeur.Construire();
    }
}
