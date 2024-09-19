class NoArrayChange {
    public static void main(String args[]) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Corrected array initialization

        // Use for-each loop to print values
        for (int x : nums) {
            System.out.print(x + " "); // Print each value with a space
            x = x * 10; // Attempt to modify the value of x (won't affect the array)
        }

        System.out.println(); // Move to the next line

        // Print array to show no changes were made
        for (int x : nums) {
            System.out.print(x + " "); // Print each value with a space
        }

        System.out.println(); // Move to the next line
    }
}
