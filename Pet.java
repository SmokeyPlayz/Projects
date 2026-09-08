// Damarcus Crowell
// Pet.java
// CS Assignment: First Java class - Pet blueprint

public class Pet {
    private String name;

    public Pet() {
        setName("Pet Name");
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        String result = "Pet information:";
        result += "\nName: " + getName();
        return result;
    }

    public static void main(String[] args) {
        Pet p1 = new Pet();
        System.out.println(p1.toString());

        Pet p2 = new Pet();
        p2.setName("Kane");
        System.out.println(p2.toString());
    }
}
