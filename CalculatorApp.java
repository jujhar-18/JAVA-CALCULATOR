import java.util.Scanner;

class Calculator {
    // Overloaded methods
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    int subtract(int a, int b) { return a - b; }
    double multiply(double a, double b) { return a * b; }
    double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return (double) a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.println("1. Two ints | 2. Two doubles | 3. Three ints");
                        int ch = sc.nextInt();
                        if (ch == 1) {
                            System.out.print("Enter two integers: ");
                            System.out.println("Result: " + c.add(sc.nextInt(), sc.nextInt()));
                        } else if (ch == 2) {
                            System.out.print("Enter two doubles: ");
                            System.out.println("Result: " + c.add(sc.nextDouble(), sc.nextDouble()));
                        } else if (ch == 3) {
                            System.out.print("Enter three integers: ");
                            System.out.println("Result: " + c.add(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter two integers: ");
                        System.out.println("Result: " + c.subtract(sc.nextInt(), sc.nextInt()));
                    }
                    case 3 -> {
                        System.out.print("Enter two doubles: ");
                        System.out.println("Result: " + c.multiply(sc.nextDouble(), sc.nextDouble()));
                    }
                    case 4 -> {
                        System.out.print("Enter two integers: ");
                        System.out.println("Result: " + c.divide(sc.nextInt(), sc.nextInt()));
                    }
                    case 5 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear invalid input
            }
        } while (choice != 5);
        sc.close();
    }
}
