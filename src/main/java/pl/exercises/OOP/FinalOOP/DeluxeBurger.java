package pl.exercises.OOP.FinalOOP;

public class DeluxeBurger extends Humburger{

    public DeluxeBurger() {
        super("Deluxe", "Sousage & Bacon", 15, "White");
        super.addHamburegerAddition1("Chips", 2.75);
        super.addHamburegerAddition2("Drink", 1.75);

    }

    @Override
    public void addHamburegerAddition1(String name, double price) {
        System.out.println(" Cannot add addition items to a delux burger");
    }

    @Override
    public void addHamburegerAddition2(String name, double price) {
        System.out.println(" Cannot add addition items to a delux burger");
    }

    @Override
    public void addHamburegerAddition3(String name, double price) {
        System.out.println(" Cannot add addition items to a delux burger");
    }

    @Override
    public void addHamburegerAddition4(String name, double price) {
        System.out.println(" Cannot add addition items to a delux burger");
    }
}
