import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,t;

        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //sorting the array
        for(i = 0; i < n; i++){
            for(j = i;j<n;j++){
                if(arr[i]>arr[j])
                {t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;}
            }
        }

        // printing the sorted array
        System.out.println("Sorted array is : ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
}}
