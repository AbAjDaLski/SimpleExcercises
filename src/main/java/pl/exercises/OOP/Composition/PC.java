package pl.exercises.OOP.Composition;

public class PC {

    private Case theCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLog();
    }

    public void drawLog(){
        //Fancy graphics
        monitor.drawPixelAt(1300, 100, "green");
    }


}
