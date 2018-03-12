package pl.exercises.OOP.Polymorphism;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelarate() {
        return "Car -> accelarate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

}

class Ferrari extends Car {

    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Ferrari -> accelarate()";
    }

    @Override
    public String brake() {
        return "Ferrari -> brake()";
    }
}

class Opel extends Car {

    public Opel(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String accelarate() {
        return getClass().getSimpleName() + "-> accelarate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

public class MainCar {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Ferrari ferrari = new Ferrari(6, "488 GTB");
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelarate());
        System.out.println(ferrari.brake());

        Citroen citroen = new Citroen(6, "C5");
        System.out.println(citroen.startEngine());
        System.out.println(citroen.accelarate());
        System.out.println(citroen.brake());

        Opel opel = new Opel(6, "Vectra");
        System.out.println(opel.startEngine());
        System.out.println(opel.accelarate());
        System.out.println(opel.brake());


    }

}
