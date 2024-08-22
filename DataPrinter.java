public class DataPrinter {
    // Method to print an integer
    public static void printData(int data) {
        System.out.println("Integer: " + data);
    }

    // Method to print a double
    public static void printData(double data) {
        System.out.println("Double: " + data);
    }

    // Method to print a string
    public static void printData(String data) {
        System.out.println("String: " + data);
    }

    public static void main(String[] args) {
        printData(5);
        printData(3.14);
        printData("Hello, Java!");
    }
}
