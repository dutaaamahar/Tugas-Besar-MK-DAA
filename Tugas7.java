package praktikum;

import java.util.Arrays;

public class Tugas7 {
    
    public static void swap(int[] A, int l, int p) {
        int temp = A[l];
        A[l] = A[p];
        A[p] = temp;
    }
    
    public static int lomutoPartition(int[] A, int l, int p) {
        System.out.println("\n" + Arrays.toString(A) + " (L:" + A[l] + " | " + "P:" + A[p] + ")");
        boolean isRight = true;
        while (p > l) {
            if (A[p] < A[l]) {
                swap(A, l, p);
                System.out.println(Arrays.toString(A) + " <--- " + A[l] + " swap " + A[p]);
                isRight = !isRight;
            }
            else if (isRight) {
                l++;
                System.out.println(Arrays.toString(A) + " (L:" + A[l] + " | " + "P:" + A[p] + ")");
            }
            else {
                p--;
                System.out.println(Arrays.toString(A) + " (L:" + A[l] + " | " + "P:" + A[p] + ")");
            }
        }
        System.out.println("Pivot : " + A[p]);
        return p; // return pivot
    }
    
    public static void quickSort(int[] A, int l, int p) {
        if (p > l) {
            int pivot = lomutoPartition(A, l, p);
            quickSort(A, pivot+1, p); // conquer patisi kiri
            quickSort(A, l, pivot-1); // conquer partisi kanan
        }
    }
    
    public static void main(String args[]) {
        int[] data = {8,4,9,2,5,7};
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length-1);
        System.out.println("\n" + Arrays.toString(data));
    }
}
