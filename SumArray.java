import java.util.Scanner;

public class SumArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize a variable for sum 
        int sum = 0;

        // adding the elements of the array in sum 
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            }
        

        // Output the results
        System.out.println("Sum of all elements in the array: " + sum);
        
    }
}

