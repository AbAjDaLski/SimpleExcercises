package pl.exercises.OOP.Composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int sizeScreen;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int sizeScreen, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.sizeScreen = sizeScreen;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + " , " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSizeScreen() {
        return sizeScreen;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
