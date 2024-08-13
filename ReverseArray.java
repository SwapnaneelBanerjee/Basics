import java.util.Scanner;

class ReverseArray {
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

        //Reversing the array into a new array
        int[] rev = new int [n];
        for(int j = 0;j<n;j++){
            rev[j] = arr[n-1-j];
            System.out.println(rev[j]);
        }
        


        
    }}