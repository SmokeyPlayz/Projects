// Damarcus Crowell
// Exam.java
// CS Assignment: Exam class extends Assessment

public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int questions, int missed) {
        // A zero question count cannot be used to calculate points per question.
        if (questions == 0) {
            throw new ArithmeticException("The number of questions cannot be zero.");
        }

        if (questions < 0) {
            throw new IllegalArgumentException("The number of questions must be positive.");
        }

        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException("Questions missed must be between 0 and " + questions + ".");
        }

        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        // The score is private in Assessment, so use its setter.
        // Round the calculated score to the nearest whole number.
        setScore((int) Math.round(100 - (numMissed * pointsEach)));
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public int getNumMissed() {
        return numMissed;
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
