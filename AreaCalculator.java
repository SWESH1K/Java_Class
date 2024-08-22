public class AreaCalculator {
    // Method to calculate the area of a rectangle
    public static int area(int length, int width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static int area(int side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle (5x10): " + area(5, 10));
        System.out.println("Area of square (7x7): " + area(7));
        System.out.println("Area of circle (radius 4.5): " + area(4.5));
    }
}
