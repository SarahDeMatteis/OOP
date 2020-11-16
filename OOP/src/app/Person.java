package app;

public class Person {

    private int age;
    private final String NAME;
    private int heightInches;
    private int numTimesSkydiving;
    
    private static final String SPECIES = "Homo Sapiens";

    public Person(int age, String NAME, int heightInches) {
        this.age = age;
        this.NAME = NAME;
        this.heightInches = heightInches;
    }

    public Person(int age, String NAME, int heightInches, int numTimesSkydiving){
        this.age = age;
        this.NAME = NAME;
        this.heightInches = heightInches;
        this.numTimesSkydiving = numTimesSkydiving;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return NAME;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public int getNumTimesSkydiving() {
        return numTimesSkydiving;
    }

    public static String getSpecies() {
        return SPECIES;
    }

}