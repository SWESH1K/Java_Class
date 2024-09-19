class ForLoopBreak {
    public static void main(String args[]) {

        int i = 0; // Initialize i

        while (i < 100) { // Loop as long as i is less than 100
            if (i == 10) break; // Terminate loop if i is 10
            System.out.println("i: " + i); // Print the value of i
            i++; // Increment i
        }

        System.out.println("Loop complete."); // Print message after loop is exited
    }
}
