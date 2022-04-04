package praktikum;

import java.util.Arrays;

public class quickSort {
    
    public static void swap(int[] A, int p, int r) {
        int temp = A[p];
        A[p] = A[r];
        A[r] = temp;
    }
    
    public static int hoarePartition(int[] A, int p, int r) {
        System.out.println("\n" + Arrays.toString(A) + " (P:" + A[p] + " | " + "R:" + A[r] + ")");
        boolean isLeft = true;
        while (p < r) {
            if (A[p] > A[r]) {
                swap(A, p, r);
                System.out.println(Arrays.toString(A) + " <--- " + A[p] + " swap " + A[r]);
                isLeft = !isLeft;
            }
            else if (isLeft) {
                r--;
                System.out.println(Arrays.toString(A) + " (P:" + A[p] + " | " + "R:" + A[r] + ")");
            }
            else {
                p++;
                System.out.println(Arrays.toString(A) + " (P:" + A[p] + " | " + "R:" + A[r] + ")");
            }
        }
        System.out.println("Pivot : " + A[p]);
        return p; // return pivot
    }
    
    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int pivot = hoarePartition(A, p, r);
            quickSort(A, p, pivot-1); // conquer patisi kiri
            quickSort(A, pivot+1, r); // conquer partisi kanan
        }
    }
    
    public static void main(String args[]) {
        int[] data = {8,4,9,2,5,7};
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length-1);
        System.out.println("\n" + Arrays.toString(data));
    }
}
