public class ArraySum {
    public static void main(String[] args) {
        // Initializing and declaring the array
        int[] array = {1, 2, 3, 4, 5};
        // Initalizing the variable sum = 0
        int sum = 0;

        // Iterating to each element in the array and adding it to the sum.
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of elements in the array is " + sum);
    }
}