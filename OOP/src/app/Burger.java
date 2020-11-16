package app;

public class Burger extends Food {

    private final String NAMEOFBURGER;
    private int numBacons;
    private int numPatties;
    private int numTomatoes;
    private boolean hasKetchup;
    private boolean hasMayo;

    private static final int NUM_BUNS = 2;

    public Burger(String NAMEOFBURGER, int numBacons, int numPatties, int numTomatoes, boolean hasKetchup, boolean hasMayo, int calories, boolean vegan) {

        this.NAMEOFBURGER = NAMEOFBURGER;
        this.numBacons = numBacons;
        this.numPatties = numPatties;
        this.numTomatoes = numTomatoes;
        this.hasKetchup = hasKetchup;
        this.hasMayo = hasMayo;
        this.calories = calories;
        this.vegan = vegan;

    }

    public int getBaconStrips() {
        return numBacons;
    }

    public int getPatties() {
        return numPatties;
    }

    public int getTomatoes() {
        return numTomatoes;
    }

    public boolean hasKetchup() {
        return hasKetchup;
    }

    public boolean hasMayo() {
        return hasMayo;
    }

    public String getName() {
        return NAMEOFBURGER;
    }

    public static int getBuns() {
        return NUM_BUNS;
    }
}