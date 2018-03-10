package pl.exercises.OOP.BankAccount;

public class Main {
    public static void main(String[] args) {


//        Account bobsAccount = new Account();//"12345", 0.00, "Bob Brown", "bob@bo.com", "(078) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
        //Account bobsAccount=new Account();
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("bobB@bo.com");
//        bobsAccount.setCustomerPhoneNumber("(087) 123-4567");
//        bobsAccount.withdrawl(100.0);
//
//        bobsAccount.deposit(54.0);
//        bobsAccount.withdrawl(100.0);
//
//        bobsAccount.deposit(58.0);
//        bobsAccount.withdrawl(100);

        Account adaAccount=new Account("Ada", "ada@gp.pl", "2455");
        System.out.println(adaAccount.getNumber() + " Name " + adaAccount.getCustomerName());
        System.out.println("Current balance is = " +adaAccount.getBalance());
        adaAccount.withdrawl(100.55);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

//        VIPPerson person1 = new VIPPerson();
//        System.out.println(person1.getName());
//
//        VIPPerson person2 = new VIPPerson("Rob", 2500.20);
//        System.out.println(person2.getName());
//
//        VIPPerson person3 = new VIPPerson("Skaly", 100.23, "Skaly@zc.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

    }
}
