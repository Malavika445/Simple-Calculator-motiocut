//Certainly! Below is a simple example of a calculator application in Java. You can use this as a starting point and expand upon it as needed.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator Application");

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Choose the operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        // Perform the operation and display the result
        double result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
}

