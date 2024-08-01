public class DynInit {
    public static void main(String[] args) {
        double a=3.0, b=4.0;

        // C is initialised dynamically.
        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hypotenuse(c) value is " + c);
    }
}
