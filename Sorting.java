import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner karan = new Scanner(System.in);
        while(true) {
            System.out.println("1.Selection Sort");
            System.out.println("2.Bubble Sort");
            int op = karan.nextInt();
            if (op==1) {
                System.out.println(selection());
            }
            else if (op==100) {
                break;
            }
            karan.close();
        }
    }
    static int[] selection() {
        int arr[] = {12,4,54,2334,65,34,6,36};
        for (int i=0; i<arr.length; i++) {
            int mini = i;
            for (int j=0; j<arr.length; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));  
    }
}
