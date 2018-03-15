package pl.exercises.OOP.FinalOOP;

public class Main {
    public static void main(String[] args) {
        Humburger humburger = new Humburger("Basic", "Beef", 4, "White");
        double price = humburger.itemizeHumburger();
        humburger.addHamburegerAddition1("Lettuce", 0.80);
        humburger.addHamburegerAddition2("Tomato", 1);
        humburger.addHamburegerAddition3("Chees", 1.5);
        System.out.println("Total Burger price is " + humburger.itemizeHumburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 6);
        healthyBurger.addHamburegerAddition1("Double Chees", 2);
        healthyBurger.addHealthyAddition1("Rocket", 3);
        System.out.println("Total Burger price is " + healthyBurger.itemizeHumburger());
        System.out.println("\n");
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburegerAddition3("Should not do this", 50.35);
        db.itemizeHumburger();

    }
}
