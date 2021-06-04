// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

// ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
// ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
// ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
// ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner karan = new Scanner(System.in);
        System.out.println("Enter Number of Elements you want to insert");
        
        int n = karan.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter Array");
        
        // add values to the array
        for (int i = 0; i < n; i++) {
            a[i] = karan.nextInt();
        }
        
        // now running loop n-1 times and comparing elements 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (a[j+1] < a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                } 
            }
        }
        
        // for printing elements from the array
        for (int item: a) {
            System.out.print(item +" ");
        }
    }
}

// Thank You
