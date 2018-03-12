package pl.exercises.OOP.Polymorphism;

class Citroen extends Car {

    public Citroen(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Citroen -> startEngine()";
    }

    @Override
    public String accelarate() {
        return "Citroen -> accelarate()";
    }

    @Override
    public String brake() {
        return "Citroen -> brake()";
    }
}

