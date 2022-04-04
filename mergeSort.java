package praktikum;

import java.util.Arrays;

public class mergeSort {
    
    public static void merge(int[] A, int p, int q, int r) {
        
        int n1 = q - p + 1;
        int n2 = r - q;
        
        // Buat array Left
        int[] L = new int[n1 + 1];
        
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        
        L[n1] = Integer.MIN_VALUE;
        
        System.out.print("L : " + Arrays.toString(L));
        
        // Buat array Right
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n2; i++) {
            R[i] = A[q + i + 1];
        }
        
        R[n2] = Integer.MIN_VALUE;
        
        System.out.print(" R : " + Arrays.toString(R) + "\n");
        
        // Conquer dan Merge
        int i = 0, j = 0;
        
        for (int k = p; k <= r; k++) {
            if (L[i] > R[j]) { // Conquer
                A[k] = L[i]; // Merge
                
                System.out.println(Arrays.toString(A) + " <--- " + L[i] + " > " + R[j]);
                
                i++;
            } else {
                A[k] = R[j]; // Merge
                
                System.out.println(Arrays.toString(A) + " <--- " + L[i] + " < " + R[j]);
                
                j++;
            }
        }
        
        System.out.println("\n=============================================================================\n");
    }
    
    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) { // divide sampai elemennya tuggal
            int q = (p+r)/2; // divide
            
            mergeSort(A, p, q); // divide left
            mergeSort(A, q + 1, r); // divide right
            merge(A, p, q, r); // Conquer + Merge
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {5, 3, 2, 7, 1, 4, 9, 8};
        
        System.out.println(Arrays.toString(myArray) + "\n");
        
        mergeSort(myArray, 0, 7);
        
        System.out.println("\n" + Arrays.toString(myArray));
    }
}
