// Damarcus Crowell
// Tests.java
// CS Assignment: Tests blueprint class - collects scores, computes average

import java.util.Scanner;

public class Tests {
    private double ave;
    private int count;
    private int score;

    public Tests() {
    }

    public double getAve() {
        return ave;
    }

    public int getCount() {
        return count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        score = newScore;
    }

    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int scoreCount = 0;

        System.out.println("Enter a test score (-1 to quit):");
        setScore(scanner.nextInt());

        while (getScore() != -1) {
            sum += getScore();
            scoreCount++;
            System.out.println("Enter a test score (-1 to quit):");
            setScore(scanner.nextInt());
        }

        count = scoreCount;
        ave = (double) sum / count;
    }

    public String toString() {
        String result = "The average of the " + getCount() + " scores entered is ";
        result += String.format("%.2f", getAve());
        result += ".";
        return result;
    }
}
