public class ArrayReverse {
    public static void main(String[] args) {
        // Initializing and declaring the array
        int[] array = {1, 2, 3, 4, 5};
        // Storing the length of the array in variable size
        int size = array.length;

        // Iterating the half array and swapping the numbers to reverse the array.
        for(int i=0; i<size/2; i++) {
            // Swapping the numbers
            int temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }

        // Printing the array after reversing.
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
