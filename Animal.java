// Damarcus Crowell
// Animal.java
// CS Midterm Project: Animal blueprint class

public class Animal {
    private String species;

    public Animal() {
    }

    public Animal(String newSpecies) {
        setSpecies(newSpecies);
    }

    public void setSpecies(String newSpecies) {
        species = newSpecies;
    }

    public String getSpecies() {
        return species;
    }

    public String toString() {
        return "Species: " + getSpecies();
    }
}
