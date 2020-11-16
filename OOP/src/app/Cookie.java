package app;

public class Cookie extends Food {

    private String type;

    public Cookie(String type, int calories, boolean vegan) {

        this.type = type;
        this.calories = calories;
        this.vegan = vegan;

    }

    public String getType() {
        return type;
    }
}