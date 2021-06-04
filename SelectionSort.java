// The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
// The algorithm maintains two subarrays in a given array.
// 1) The subarray which is already sorted. 
// 2) Remaining subarray which is unsorted.
// In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner karan = new Scanner(System.in);
      
        System.out.println("Enter Number of Elements you want to insert");
        
        // number of elements you want to insert
        int n = karan.nextInt();
        int a[] = new int[n];
      
        System.out.println("Enter Array");
        
        // Entering values to array
        for (int i = 0; i < n; i++) {
            a[i] = karan.nextInt();
        }
      
        // loop for sorting
        for (int i = 0; i < n-1; i++) {
            int k = i;
          
            // loop for finding the minimum element
            for (int j = i; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
          
            // swapping values with the minimun value
            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
      
        // printing the array 
        for (int items: a) {
            System.out.print(items +" ");
        }
    }
}

// Thank You
