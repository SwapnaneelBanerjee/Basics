import java.util.Scanner;

class MinMax {
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

        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];

        // checking each element to find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output the results
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    }
}
