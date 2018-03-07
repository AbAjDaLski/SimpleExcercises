package pl.exercises.Task.T35;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        //   System.out.println("Model is " +porsche.getModel());
        //porsche.model = "Carrera"; //parameter have to be public
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
