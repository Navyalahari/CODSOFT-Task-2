import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();
        if (numSub <= 0) {
            System.out.println("Number of subjects should be greater than 0.");
            return;
        }
        int totalMarks = 0;
        for (int i = 1; i <= numSub; i++) {
            System.out.print("Enter marks (out of 100) for Subject " + i + ": ");
            int subMarks = scanner.nextInt();
            if (subMarks < 0 || subMarks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                return;
            }
            totalMarks += subMarks;
        }
        double totalPercentage = (double) totalMarks / (numSub * 100) * 100;
        String AvgPercentage = String.format("%.2f", totalPercentage);
        char grade = calculateGrade(totalPercentage);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + AvgPercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
    private static char calculateGrade(double AvgPercentage) {
        if (AvgPercentage >= 90) {
            return 'A';
        } else if (AvgPercentage >= 80) {
            return 'B';
        } else if (AvgPercentage >= 70) {
            return 'C';
        } else if (AvgPercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
