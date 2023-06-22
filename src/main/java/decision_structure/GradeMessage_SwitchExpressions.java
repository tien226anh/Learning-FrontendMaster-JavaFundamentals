package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {

    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A", "B" -> "Excellent";
//            case "B" -> "Great job";
            case "C" -> {
                System.out.println("print");
                yield "Good";
            }
            case "D" -> "Pass";
            case "F" -> "Fail";
            default -> "Invalid grade";
        };

        System.out.println(message);
    }
}
