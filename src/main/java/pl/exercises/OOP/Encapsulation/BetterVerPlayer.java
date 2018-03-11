package pl.exercises.OOP.Encapsulation;

public class BetterVerPlayer {

    public String name;
    public int energy = 100;
    public String weapon;

    public BetterVerPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health < 100) {
            this.energy = health;
        } else {
            System.out.println("Game over");
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.energy = this.energy - damage;
        if (this.energy <= 0) {
            System.out.println("Player is knocked out");
        }
    }

    public int getHealth() {
        return energy;
    }
}
