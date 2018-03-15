package pl.exercises.OOP.FinalOOP;

public class HealthyBurger extends Humburger {

    private String helthyExtra1Name;
    private double helthyExtra1Price;

    private String helthyExtra2Name;
    private double helthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.helthyExtra1Name=name;
        this.helthyExtra1Price=price;
    }

    public void addHealthyAddition2(String name, double price){
        this.helthyExtra2Name=name;
        this.helthyExtra2Price=price;
    }

    @Override
    public double itemizeHumburger() {
        double humburgerPrice=super.itemizeHumburger();
        if (this.helthyExtra1Name != null){
            humburgerPrice+=this.helthyExtra1Price;
            System.out.println("Added " + this.helthyExtra1Name + " for an extra " + this.helthyExtra1Price);

        }

        if (this.helthyExtra2Name != null){
            humburgerPrice+=this.helthyExtra2Price;
            System.out.println("Added " + this.helthyExtra2Name + " for an extra " + this.helthyExtra2Price);

        }
        return humburgerPrice;
    }
}
