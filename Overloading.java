class OverloadingDemo {
    void test() {
        System.out.println("No Parameters");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a: " + a + " " + "b: " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

public class Overloading {
    public static void main(String[] args) {
        OverloadingDemo ob = new OverloadingDemo();

        ob.test();
        ob.test(12);
        ob.test(10, 12);
        double ans = ob.test(12.2);
        System.out.println("Result of ob.test(12.2) is " + ans);
    }
}
