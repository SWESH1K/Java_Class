class Rectangle {
    int length;
    int width;

    // Default constructor
    public Rectangle() {
        this.length = 1; // Default length
        this.width = 1;  // Default width
    }

    // Constructor with one parameter (square)
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters (rectangle)
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }
}

public class Rectangle_constructor_overloading {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5);
        Rectangle rect3 = new Rectangle(4, 7);

        System.out.println("Area of default rectangle: " + rect1.area());
        System.out.println("Area of square (side 5): " + rect2.area());
        System.out.println("Area of rectangle (4x7): " + rect3.area());
    }
}
