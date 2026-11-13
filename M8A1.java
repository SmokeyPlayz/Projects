import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class M8A1 {
    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Skip the header row in pay.csv
            reader.readLine();

            // Write our own header row to output.csv
            writer.write("EmpID,Rate,Hours,Weekly Pay");
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // ignore blank lines
                }

                String[] fields = line.split(",");
                String empId = fields[0].trim();
                double rate = Double.parseDouble(fields[1].trim());
                double hours = Double.parseDouble(fields[2].trim());

                // Regular pay for up to 40 hours, 1.5x for hours over 40
                double weeklyPay;
                if (hours > 40) {
                    weeklyPay = (40 * rate) + ((hours - 40) * rate * 1.5);
                } else {
                    weeklyPay = hours * rate;
                }

                // Formatting to 2 decimals turns it into a String.
                // Wrapped in quotes so the comma in "$1,199.38" doesn't split into two columns.
                String formattedPay = String.format("$%,.2f", weeklyPay);
                String outputLine = empId + "," + rate + "," + hours + ",\"" + formattedPay + "\"";

                writer.write(outputLine);
                writer.newLine();
            }

            System.out.println("Done. Wrote " + outputFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Bad number in input file: " + e.getMessage());
        }
    }
}
