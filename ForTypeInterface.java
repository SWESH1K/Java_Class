class ForTypeInterface {
    public static void main(String args[]) {
        // Use type inference with the loop control variable.
        System.out.print("Values of x: ");

        for (var x = 2.5; x < 100.0; x = x + 2) {
            System.out.print(x + " "); // Print each value of x
            System.out.println(); // Move to the next line

            // Use type inference with the iteration variable.
            int[] nums = {1, 2, 3, 4, 5, 6}; // Corrected array initialization
            System.out.print("Values in nums array: ");
            for (var v : nums) { // Corrected loop to iterate over nums
                System.out.print(v + " "); // Print each value in nums
            }
            System.out.println(); // Move to the next line
        }
    }
}
