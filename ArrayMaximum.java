public class ArrayMaximum {
    public static void main(String[] args) {
        // Initializing and declaring the array
        int[] array = {5, 3, 1, 15, 74, 12, 9};
        // Initializing the maximum as first number in the array.
        int max = array[0];

        // Iterating the whole array and comparing each number with the maximum number.
        for(int i=0; i<array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("The maximum number in the array is " + max);
    }
}
