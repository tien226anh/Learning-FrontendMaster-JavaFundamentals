package repetition_structure;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWork = scanner.nextDouble();

        while (hoursWork > maxHours || hoursWork < 0) {
            System.out.println("Invalid entry, input must between 1 and 40");
            hoursWork = scanner.nextDouble();

        }
        scanner.close();

        double grossPay = hoursWork * rate;
        System.out.println("Gross pay: " + grossPay);
    }
}
