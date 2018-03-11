package pl.exercises.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Rob";
//        player.energy = 100;
//        player.weapon = "Shotgun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining energy " + player.healthRemining());
//
//        damage = 100;
//        player.energy=150;
//        player.loseHealth(damage);
//        System.out.println("Remaining energy " + player.healthRemining());

        BetterVerPlayer player = new BetterVerPlayer("Jack", 101, "Shotgun");
        System.out.println("Initial energy is " + player.getHealth());
    }
}
