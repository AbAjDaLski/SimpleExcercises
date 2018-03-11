package pl.exercises.OOP.Composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("6400E", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Rad", "Philips", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 5, "v2.45");

        PC thePc = new PC(theCase, theMotherboard, theMonitor);
//        thePc.getMonitor().drawPixelAt(150,1200, "red");
//        thePc.getMotherboard().loadProgram("Windows 98");
//        thePc.getTheCase().pressPowerButton();
        thePc.powerUp();

        //------ bedroom

        Wall wall1=new Wall("West");
        Wall wall2=new Wall("East");
        Wall wall3=new Wall("North");
        Wall wall4=new Wall("South");

        Ceiling ceiling=new Ceiling(14,60);

        Bed bed=new Bed("Classic", 5,3,1,2);

        Lamp lamp=new Lamp("Retro", true, 80);

        Bedroom bedroom=new Bedroom("Rob", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLampl().turnOn();
    }
}
