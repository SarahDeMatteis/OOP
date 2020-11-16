package app;

public class Chicken extends Food {

    private String type;
    private int temperature;

    public Chicken(String type, int temperature, int calories, boolean vegan) {

        this.type = type;
        this.temperature = temperature;
        this.calories = calories;
        this.vegan = vegan;

    }

    public boolean isFinished(int targetTemp) {
        targetTemp = 180;
        if (temperature >= targetTemp){
            return true;
        } else {
            return false;
        }
    }

    public String getType() {
        return type;
    }
}