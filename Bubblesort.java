//Bubblesort 
import java.util.*;
class ABC{
public static void main(String[] args) {
  int[] a = {1,3,4,2,8,5,7,9,12,10};
  System.out.println("Original Array: " + Arrays.toString(array));
        
        bubbleSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

  public static void bubbleSort(int[] a){
     int n = arr.length;
     boolean swapped;
    for (int i = 0; i < n - 1; i++) {
            swapped = false; 

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
}
     if (!swapped) {
                break;
            }
    }
  }
}
