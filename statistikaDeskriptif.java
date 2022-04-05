// NAMA     : Dwi Duta Mahardewantoro
// NIM      : 20200410700071

package praktikum;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class statistikaDeskriptif {
    
    public static int[] inputArray(int data) {
        Scanner input = new Scanner(System.in);
        
        int j = 1;
        int[] temp = new int[data];
        
        for(int i = 0; i < data; i++) { // Looping untuk input Array
            System.out.print("  Input data " + j + " = ");
            temp[i] = input.nextInt();
            
            j++;
        }
        
        return temp;
    }
    
    public static void insertionSort(int[] tempArray) {
        for(int i = 1;  i < tempArray.length; i++) {
            int j = i - 1;
            int key = tempArray[i];
            
            while(j >= 0 && tempArray[j] > key) {
                tempArray[j + 1] = tempArray[j];
                j--;
            }
            
            tempArray[j + 1] = key;
        }
    }
    
    public static void Mean(int[] A, int data) {
        double sum = IntStream.of(A).sum();
        double mean = sum / data;
        
        System.out.println(" Rata-Rata  = " + mean);
    }
    
    public static void Median(int[] A) {
        double median;
        
        if(A.length % 2 == 1) {
            median = A[A.length / 2]; // Median untuk data ganjil
            System.out.println(" Median     = " + median);
        } else {
            median = ((double) (A[A.length / 2] + A[(A.length / 2) - 1])) / 2; // Median untuk data genap
            System.out.println(" Median     = " + median);
        }
    }
    
    public static void nilaiMaxMin(int[] A) {
        int max = A[0];
        int min = A[0];
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) { // Mencari nilai Terbesar
                max = A[i];
            } else if (A[i] < min) { // Mencari nilai Terkecil
                min = A[i];
            }
        }
        
        System.out.println(" Nilai Max  = " + max);
        System.out.println(" Nilai Min  = " + min);
    }
    
    public static void Range(int[] A) {
        int range;
        int max = A[0];
        int min = A[0];
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            } else if (A[i] < min) {
                min = A[i];
            }
        }
        
        range = max - min;
        
        System.out.println(" Range      = " + range);
    }
    
    /*public static void cetakArray(int[] myArray) {
            System.out.println(Arrays.toString(myArray));
    }*/
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int data;
        int[] A;
        
        System.out.println(" Program Statistika Deskriptif");
        
        System.out.print("\n Input jumlah data = ");
        data = input.nextInt();
        
        A = inputArray(data);
        
        System.out.println("\n " + Arrays.toString(A) + " <--- Data Belum Terurut");
        //cetakArray(A);
        
        insertionSort(A);
        
        System.out.println("\n " + Arrays.toString(A) + " <--- Data Terurut\n");
        
        Mean(A, data);
        
        Median(A);
        
        nilaiMaxMin(A);
        
        Range(A);
    }
}
