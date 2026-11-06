// Damarcus Crowell
// Exam.java
// CS Assignment: Exam class extends Assessment

public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;

        // score is private in Assessment, so use its set method
        // the score is a double here but Assessment stores an int, so round to the nearest point
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
