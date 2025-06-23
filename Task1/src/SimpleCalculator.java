import java.util.Scanner;

public class SimpleCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println(" Welcome to Simple Calculator!");

        while (continueCalc) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Addition (+)");
            System.out.println("2 - Subtraction (-)");
            System.out.println("3 - Multiplication (*)");
            System.out.println("4 - Division (/)");
            System.out.println("5 - Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                continueCalc = false;
                System.out.println(" Exiting Calculator. Goodbye!");
                break;
            }

            // Input numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Perform selected operation
            double result;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    if (!Double.isNaN(result))
                        System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
