// UserInterface.java
import java.util.Scanner;

public class UserInterface {
    private Calculator calculator;
    private Scanner scanner;

    public UserInterface() {
        calculator = new Calculator();
        scanner = new Scanner(System.in);
    }

    // Perform addition
    public void performAddition() {
        try {
            System.out.println("\n===== Addition Menu =====");
            System.out.println("1. Add two integers");
            System.out.println("2. Add two doubles");
            System.out.println("3. Add three integers");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int int1 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int int2 = scanner.nextInt();
                    int resultInt = calculator.add(int1, int2);
                    System.out.println("Result: " + resultInt);
                    break;

                case 2:
                    System.out.print("Enter first double: ");
                    double double1 = scanner.nextDouble();
                    System.out.print("Enter second double: ");
                    double double2 = scanner.nextDouble();
                    double resultDouble = calculator.add(double1, double2);
                    System.out.println("Result: " + resultDouble);
                    break;

                case 3:
                    System.out.print("Enter first integer: ");
                    int a = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int b = scanner.nextInt();
                    System.out.print("Enter third integer: ");
                    int c = scanner.nextInt();
                    int resultThree = calculator.add(a, b, c);
                    System.out.println("Result: " + resultThree);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Perform subtraction
    public void performSubtraction() {
        try {
            System.out.print("\nEnter first integer: ");
            int a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int b = scanner.nextInt();
            int result = calculator.subtract(a, b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Perform multiplication
    public void performMultiplication() {
        try {
            System.out.print("\nEnter first double: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second double: ");
            double b = scanner.nextDouble();
            double result = calculator.multiply(a, b);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Perform division
    public void performDivision() {
        try {
            System.out.print("\nEnter dividend (integer): ");
            int a = scanner.nextInt();
            System.out.print("Enter divisor (integer): ");
            int b = scanner.nextInt();
            double result = calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Main menu
    public void mainMenu() {
        int choice = 0;

        do {
            System.out.println("\n===== Welcome to the Calculator Application! =====");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        performAddition();
                        break;
                    case 2:
                        performSubtraction();
                        break;
                    case 3:
                        performMultiplication();
                        break;
                    case 4:
                        performDivision();
                        break;
                    case 5:
                        System.out.println("Thank you for using the Calculator!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1-5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear buffer
                choice = 0;
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}