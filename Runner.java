// Damarcus Crowell
// Runner.java
// CS Assignment: main() method, instantiates 3 Pet objects

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet p1 = new Pet();
        System.out.println(p1.toString());

        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2.toString());

        System.out.println("Enter animal type:");
        String inputType = scanner.nextLine();
        System.out.println("Enter animal name:");
        String inputName = scanner.nextLine();
        System.out.println("Enter animal age:");
        int inputAge = scanner.nextInt();

        Pet p3 = new Pet(inputName, inputType, inputAge);
        System.out.println(p3.toString());
    }
}
