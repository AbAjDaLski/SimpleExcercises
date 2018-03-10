package pl.exercises.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Nemo", 5, 3, 1, 2, 3);
        System.out.println("Name fish " + fish.getName());
        fish.swim(5);


    }
}
