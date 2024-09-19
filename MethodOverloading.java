
class Arithmetic {
    void add() {
        System.out.println("No numbers");
    }

    void add(int a) {
        System.out.println("Sum: " + a);
    }

    void add(int a, int b) {
        System.out.println("Sum: " + (a+b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Arithmetic ob = new Arithmetic();
        ob.add();
        ob.add(1);
        ob.add(1, 2);
        ob.add(1, 2, 3);
    }
}
