public class IfStatement {  // 2310080053 - Sweshik Reddy.

    public static void main(String[] args) {
        int num1, num2;  // Declaring num1, num2

        // Initializing num1, num2
        num1 = 10;
        num2 = 20;

        // If num1 is greater than num2
        if(num1 < num2) System.out.println("Num1 is less than Num2.");
        num1*=2; // Updating num1 value
        // If num1 equal to num2
        if(num1 == num2) System.out.println("Num1 is equal to Num2.");
        num1*=2; // Updating num1 value
        if(num1 > num2) System.out.println("Num1 is greater than Num2.");

        // This will not be printed
        if(num1 == num2) System.out.println("You won't see this.");
    }
}
