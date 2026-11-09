import javax.swing.JOptionPane;

/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 It uses exception handling to reject invalid exam inputs.
 */
public class Runner {

    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        // Keep asking until both answers are valid, or the user cancels.
        while (true) {
            try {
                // Get the number of questions on the exam.
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                if (input == null) {
                    return;
                }
                questions = Integer.parseInt(input.trim());

                // Get the number of questions the student missed.
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                if (input == null) {
                    return;
                }
                missed = Integer.parseInt(input.trim());

                // Exam checks for zero questions and other invalid counts.
                Exam exam = new Exam(questions, missed);

                // Display the test results.
                String message = "Each question counts " + exam.getPointsEach();
                message += " points.\nThe exam score is " + exam.getScore();
                message += "\nThe exam grade is " + exam.getGrade();
                JOptionPane.showMessageDialog(null, message);
                return;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Please enter a whole number, not letters or other text.",
                        "Invalid Number", JOptionPane.ERROR_MESSAGE);

            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(), "Invalid Number of Questions",
                        JOptionPane.ERROR_MESSAGE);

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null,
                        e.getMessage(), "Invalid Exam Input",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
