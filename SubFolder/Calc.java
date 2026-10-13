// Damarcus Crowell
// Calc.java
// CS Assignment: Calc class with numeric input validation

import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc() {
    }

    public void setNum1(double newNum1) {
        num1 = newNum1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double newNum2) {
        num2 = newNum2;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // Keeps asking until the user enters a valid number, then returns it.
    // Accepts whole numbers and decimals, positive or negative (like 14, -3, 2.8).
    public double getValidNumber(Scanner scan, String prompt) {
        System.out.println(prompt);
        String input = scan.nextLine().trim();

        // pattern: optional minus sign, digits, then an optional decimal part
        while (!input.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("That is not a valid number. Please try again.");
            System.out.println(prompt);
            input = scan.nextLine().trim();
        }

        return Double.parseDouble(input);
    }

    public String toString() {
        String result = "Displaying private data fields using toString():";
        result += "\nNum1: " + num1;
        result += "\nNum2: " + num2;
        return result;
    }
}
