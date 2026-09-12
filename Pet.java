// Damarcus Crowell
// Pet.java
// CS Assignment: Pet class with type, age, and speak() method

public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String speak() {
        String sound;
        if (getType().equals("Dog")) {
            sound = "Woof";
        } else if (getType().equals("Cat")) {
            sound = "Meow";
        } else {
            sound = "Yowl";
        }
        return sound;
    }

    public String toString() {
        String result = "Pet information:";
        result += "\nType: " + getType();
        result += "\nName: " + getName();
        result += "\nSound: " + speak();
        result += "\nAge:  " + getAge();
        return result;
    }
}
