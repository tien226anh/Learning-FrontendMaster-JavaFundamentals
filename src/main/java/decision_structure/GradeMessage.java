package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good";
                break;
            case "D":
                message = "Pass";
                break;
            case "F":
                message = "Fail";
                break;
            default:
                message = "Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
