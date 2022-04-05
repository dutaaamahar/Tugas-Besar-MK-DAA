// NAMA     : Dwi Duta Mahardewantoro
// NIM      : 20200410700071

package praktikum;

import java.util.Scanner;

public class matriks {
    
    public static int[][] inputMatriks(int index) {
        Scanner input = new Scanner(System.in);
        
        int x = 1;
        int[][] temp = new int[index][index];
        
        //index += 1;
        
        for(int i = 0; i < index; i++) { // Looping untuk input Matriks Multidimensional
            int y = 1;
            
            for(int j = 0; j < index; j++) {
                System.out.print("  Input data [" + x + "]" + "[" + y + "]" + " = ");
                temp[i][j] = input.nextInt();
                
                y++;
            }
            
            x++;
        }
        
        return temp;
    }
    
    public static void cetakMatriks(int[][] M, int index) {
        for(int i = 0; i < index; i++) { // Looping untuk mencetak nilai Matriks
            for(int j = 0; j < index; j++) {
                System.out.print("            " + M[i][j]);
            }
            
            System.out.println("");
        }
    }
    
    public static void Positif(int[][] M, int index) {
        int sum = 0;
        
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                if(M[i][j] > 0) {
                    sum += M[i][j];
                }
            }
        }
        
        System.out.println("\n Jumlah elemen positif  = " + sum);
    }
    
    public static void Negatif(int[][] M, int index) {
        int sum = 0;
        
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                if(M[i][j] < 0) {
                    sum += M[i][j];
                }
            }
        }
        
        System.out.println(" Jumlah elemen negatif  = " + sum);
    }
    
    public static void Ganjil(int[][] M, int index) {
        int sum = 0;
        
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                if(M[i][j] % 2 == 1 || M[i][j] % 2 == -1) {
                    sum += M[i][j];
                }
            }
        }
        
        System.out.println(" Jumlah elemen ganjil   = " + sum);
    }
    
    public static void Genap(int[][] M, int index) {
        int sum = 0;
        
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                if(M[i][j] % 2 == 0) {
                    sum += M[i][j];
                }
            }
        }
        
        System.out.println(" Jumlah elemen genap    = " + sum);
    }
    
    public static void Sum(int[][] M, int index) {
        int sum = 0;
        
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                sum += M[i][j];
            }
        }
        
        System.out.println(" Jumlah semua elemen    = " + sum);
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int index;
        int[][] M;
        
        System.out.print(" Input ukuran matriks = ");
        index = input.nextInt();
        
        M = inputMatriks(index);
        
        System.out.println("");
        
        cetakMatriks(M, index);
        
        Positif(M, index);
        
        Negatif(M, index);
        
        Ganjil(M, index);
        
        Genap(M, index);
        
        Sum(M, index);
    }
}
