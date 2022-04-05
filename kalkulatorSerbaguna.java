// NAMA     : Dwi Duta Mahardewantoro
// NIM      : 20200410700071

package praktikum;

import java.util.Scanner;

public class kalkulatorSerbaguna {
    
    public static int perkalianRusia(int x, int y) {
        int total = 0;
        
        while (x > 0) {
            for (int i = 0; i < 7; i++) {
                if (x % 2 == 1) {
                    total = total + y;
                }
                
                x = x / 2;
                y = y * 2;
            }
        }
        
        return total;
    }
    
    public static int FPB(int x, int y) {
        int temp;
        
        if (x < y) {
            temp = x;
            x = y;
            y = temp;
        }
        
        while (y > 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        
        return x;
    }
    
    public static int KPK(int x, int y) {
        int i = x;
        int j = y;
        
        while (i != j) {
            if (i < j) {
                i = i + x;
            } else {
                j = j + y;
            }
        }
        
        return i;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int pilih;
        
        System.out.println(" Kalkulator Serbaguna");
        
        do {
            System.out.println("\n --------------------------------------------------");
            System.out.println(" [1] Perkalian Rusia");
            System.out.println(" [2] Perhitungan FPB");
            System.out.println(" [3] Perhitungan KPK");
            System.out.println(" [4] Keluar Program");
            
            System.out.print("\n Pilih menu Anda  = ");
            pilih = input.nextInt();
            
            switch(pilih) {
                case 1 :
                    System.out.print("\n Input bilangan 1 = ");
                    int x = input.nextInt();
                    
                    System.out.print(" Input bilangan 2 = ");
                    int y = input.nextInt();
                    
                    System.out.println(" Perkalian Rusia  = " +  perkalianRusia(x, y));
                    
                    break;
                    
                case 2 :
                    System.out.print("\n Input bilangan 1 = ");
                    x = input.nextInt();
                    
                    System.out.print(" Input bilangan 2 = ");
                    y = input.nextInt();
                    
                    System.out.println(" FPB              = " + FPB(x, y));
                    
                    break;
                    
                case 3 :
                    System.out.print("\n Input bilangan 1 = ");
                    x = input.nextInt();
                    
                    System.out.print(" Input bilangan 2 = ");
                    y = input.nextInt();
                    
                    System.out.println(" KPK              = " + KPK(x, y));
                    
                    break;
                    
                case 4 :
                    System.out.println("\n Terima kasih sudah menggunakan program ini :)");
                    
                    break;
                    
                default :
                    System.out.println("\n Menu tidak ada!");
            }
        } while (pilih < 4 || pilih > 4);
    }
}
