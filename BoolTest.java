public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b=false;
        System.out.println("The value of b is " + b);

        b=true;
        System.out.println("The value of b is " + b);

        if(b) System.out.println("This line will be executed.");

        b=false;
        if(b) System.out.println("This line will not be executed.");

        // Outcome of a relational operator is a boolean value.

        System.out.println("10 < 9 is " + (10 < 9));
    }
}
