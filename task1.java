import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        // Create ArrayLists to store student names and their grades
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of students
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // Input student names and grades
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.next();
            studentNames.add(name);

            System.out.println("Enter the grade for " + name + ":");
            double grade = scanner.nextDouble();
            studentGrades.add(grade);
        }

        // Calculate average, highest, and lowest grades
        double total = 0;
        double highestGrade = studentGrades.get(0);
        double lowestGrade = studentGrades.get(0);
        int highestGradeIndex = 0;
        int lowestGradeIndex = 0;

        for (int i = 0; i < studentGrades.size(); i++) {
            double grade = studentGrades.get(i);
            total += grade;

            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeIndex = i;
            }

            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestGradeIndex = i;
            }
        }

        double average = total / studentGrades.size();

        // Display the results
        System.out.println("\nClass Statistics:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highestGrade + " (Student: " + studentNames.get(highestGradeIndex) + ")");
        System.out.println("Lowest Grade: " + lowestGrade + " (Student: " + studentNames.get(lowestGradeIndex) + ")");
    }
}
