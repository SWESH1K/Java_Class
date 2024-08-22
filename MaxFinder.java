public class MaxFinder {
    // Method to find the maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to find the maximum of three integers
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // Method to find the maximum of four integers
    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }

    public static void main(String[] args) {
        System.out.println("Max of 4 and 7: " + max(4, 7));
        System.out.println("Max of 3, 5, 2: " + max(3, 5, 2));
        System.out.println("Max of 8, 2, 9, 4: " + max(8, 2, 9, 4));
    }
}
