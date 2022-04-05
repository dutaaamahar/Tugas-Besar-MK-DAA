package praktikum;

import java.util.Scanner;

public class Tugas3 {
    
    public static int kpk(int x, int y) {
        int bil1 = x, bil2 = y;
        
        while (bil1 != bil2) {
            if (bil1 < bil2) {
                bil1 += x;
            } else {
                bil2 += y;
            }
        }
        
        return bil1;
    }
    
    public static int fpb(int x, int y) {
        int temp, bil1 = x, bil2 = y;
        
        while (bil2 > 0) {
            temp = bil1 % bil2;
            bil1 = bil2;
            bil2 = temp;
        }
        
        return bil1;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input bilangan 1 : ");
        int bil1 = input.nextInt();
        
        System.out.print("Input bilangan 2 : ");
        int bil2 = input.nextInt();
        
        int KPK = kpk(bil1, bil2);
        int FPB = fpb(bil1, bil2);
        
        System.out.println("KPK = " + KPK);
        System.out.println("FPB = " + FPB);
    }
}
