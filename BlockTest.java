public class BlockTest {
    public static void main(String[] args) {
        int x,y;
        y=20;

        for(x=0; x<10; x++) {
            System.out.println("The value of x is " + x);
            System.out.println("The value of y is " + y);

            y-=2; // Decrementing the value of y by 2 after each iteration.
        }
    }
}