//Binary Search
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40}; 
        int target = 10; 

        int result = binarySearch(array, target); 
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0; 
        int right = arr.length - 1; 

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (arr[mid] == target) {
                return mid; 
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1; 
    }
}

