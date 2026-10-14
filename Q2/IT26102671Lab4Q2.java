
import java.util.Scanner;

public class IT26102671Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

        // Input and validate exam marks
        System.out.print("Enter exam marks (0-100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            System.out.print("Enter exam marks (0-100): ");
            examMarks = input.nextDouble();
        }

        // Input and validate lab marks
        System.out.print("Enter lab submission marks (0-100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            System.out.print("Enter lab submission marks (0-100): ");
            labMarks = input.nextDouble();
        }

        // Input and validate percentages
        System.out.print("Enter exam percentage: ");
        examPercentage = input.nextDouble();

        System.out.print("Enter lab percentage: ");
        labPercentage = input.nextDouble();

        if (examPercentage < 0 || labPercentage < 0 ||
               examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! They must add up to 100.");
            
            System.out.print("Enter exam percentage: ");
            examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            labPercentage = input.nextDouble();
        }

        // Calculate final marks
        finalMarks = (examMarks * examPercentage / 100)
                   + (labMarks * labPercentage / 100);

        System.out.printf("Final module mark: %.2f%n", finalMarks);

        input.close();
    }
}
