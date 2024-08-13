public class BasicSearch {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Value to search for
        int target = 30;

        // Perform the search
        int index = linearSearch(numbers, target);

        // Output the result
        if (index != -1) {
            System.out.println("Value " + target + " found at index: " + index);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }

    // Linear search method
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}

