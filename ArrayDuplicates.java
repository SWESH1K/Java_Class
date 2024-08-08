public class ArrayDuplicates {
    public static void main(String[] args) {
        // Initialzing the array with some duplicate elements
        int[] array = {1, 1, 4, 3, 2, 1, 5, 4, 7, 9, 8, 3};
        int size = array.length;

        // Declaring a new array dupeArray of size equal to size of array.
        int[] dupArray = new int[size];
        int j = 0; // Storing the last index or curr size of the dupArray.

        for(int i=0; i<size; i++) {
            boolean isDuplicate = false;
            for(int k=0; k<j; k++) {
                if(dupArray[k] == array[i]) { // If array[i] is already there in dupArray then mark it as duplicate.
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) { // If the array[i] is not a duplicate then add it to the dupArray.
                dupArray[j++] = array[i];
            }
        }

        // Printing the dupArray (which doesn't have duplicates)
        System.out.println("The Original array is:");
        for(int i=0; i<size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Printing the dupArray (which doesn't have duplicates)
        System.out.println("The array without duplicates is:");
        for(int i=0; i<j; i++) {
            System.out.print(dupArray[i] + " ");
        }
    }
}
