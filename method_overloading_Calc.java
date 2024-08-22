public class method_overloading_Calc {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract two double values
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply two double values
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two integers
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Returning 0 as a fallback value
        }
        return a / b;
    }

    // Method to divide two double values
    public static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0.0; // Returning 0.0 as a fallback value
        }
        return a / b;
    }

    public static void main(String[] args) {
        // Testing the add methods
        System.out.println("Add 5 + 3: " + add(5, 3));
        System.out.println("Add 1 + 2 + 3: " + add(1, 2, 3));
        System.out.println("Add 4.5 + 3.2: " + add(4.5, 3.2));

        // Testing the subtract methods
        System.out.println("Subtract 9 - 4: " + subtract(9, 4));
        System.out.println("Subtract 7.8 - 2.3: " + subtract(7.8, 2.3));

        // Testing the multiply methods
        System.out.println("Multiply 6 * 4: " + multiply(6, 4));
        System.out.println("Multiply 2.5 * 4.0: " + multiply(2.5, 4.0));

        // Testing the divide methods
        System.out.println("Divide 8 / 2: " + divide(8, 2));
        System.out.println("Divide 9.6 / 3.2: " + divide(9.6, 3.2));
        System.out.println("Divide 5 / 0: " + divide(5, 0)); // Division by zero check
    }
}
