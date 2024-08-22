class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Corrected array declaration
        int sum = 0; // Initialized sum

        // Use for-each style for loop to display and sum the values
        for(int x : nums) { // Corrected the for-each loop syntax
            System.out.println("Value is: " + x); // Print each value
            sum += x; // Sum the values
        }
        System.out.println("Sum of elements: " + sum); // Print the total sum
    }
}
