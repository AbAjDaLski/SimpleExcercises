package pl.exercises.OOP.BankAccount;

public class VIPPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public  VIPPerson(){
        this("default name", 5000.00, "default email");
    }

    public VIPPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@mail.com");
    }

    public VIPPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

