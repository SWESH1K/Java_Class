public class Scope {
    public static void main(String[] args) {
        int x; // Known to all code within main
        x = 10; // Initalizing x=10

        if (x == 10) { // True
            int y = 20; // y is known to only the code within if block.

            System.out.println("The value of x and y are " + x + " " + y);
        }

//        y = 100; //Error! y is not known here

        //But still x is known here.
        System.out.println("The value of x is " + x);
    }
}
