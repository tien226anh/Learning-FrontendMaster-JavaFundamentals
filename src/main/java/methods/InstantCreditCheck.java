package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int salary = getSalary();
        int credit = getCredit();
        scanner.close();
        String message = verifyCredit(salary, credit);
        System.out.println(message);
    }

    public static int getSalary() {
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getCredit() {
        System.out.println("Enter your credit score: ");
        int credit = scanner.nextInt();
        return credit;
    }

    public static String verifyCredit(int salary, int credit) {
        if (salary >= requiredSalary && credit >= requiredCreditScore) {
            return "Approved";
        } else {
            return "Rejected";
        }
    }
}
