//Nama  : Dwi Duta Mahardewantoro
//NIM   : 20200410700071

package praktikum;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas4 {
    
    public static int[] inputArray (int batas) {
        Scanner input = new Scanner(System.in);
        
        int j = 1;
        int[] temp = new int[batas];
        
        for (int i = 0; i < batas; i++) {
            System.out.print(" Input data ke-" + j + " = ");
            temp[i] = input.nextInt();
            
            j++;
        }
        
        return temp;
    }
    
    public static void cetakArray (int[] myArray, String spesifik) {
        System.out.println("Vector " + spesifik + " = " + Arrays.toString(myArray));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int batas;
        int[] A, B, C;
        
        System.out.print("Input Batas = ");
        batas = input.nextInt();
        
        C = new int[batas];
        
        System.out.println("\n Input Vector 1");
        A = inputArray(batas);
        
        System.out.println("\n Input Vector 2");
        B = inputArray(batas);
        
        System.out.println("");
        cetakArray(A, "1");
        cetakArray(B, "2");
        
        for (int i = 0; i < batas; i++) {
            C[i] = A[i] * B[i];
        }
        
        System.out.println("\nVector dot product = " + Arrays.toString(C));
        
        int D = Arrays.stream(C).sum();
        
        System.out.println("\nHasil dot product Vector 1 & Vector 2 = " + D);
    }
}
