package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculatorRedo.getRoom();
        Rectangle room2 = calculatorRedo.getRoom();
        double totalArea = calculatorRedo.calculateAreaOfRoom(room1, room2);
        System.out.println("Area of both rooms: " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2) {
        return room1.calculateArea() + room2.calculateArea();
    }
}
