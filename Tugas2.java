package praktikum;

import java.util.Scanner;

public class Tugas2 {

    public static int perkalianRusia(int a, int b) {
        int total = 0;
        
        while (a > 0) {
            System.out.println("A         B");
            
            for (int i = 0; i < 7; i++) {
                if (a % 2 == 1) {
                    total = total + b;
                    
                    System.out.println(a + "        " + b + "       ambil " + b);
                } else {
                    System.out.println(a + "        " + b);
                }
                
                a = a / 2;
                b = b * 2;
            }
            
            System.out.println("");
        }
        
        return total;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Bilangan 1 : ");
        int a = input.nextInt();
        
        System.out.print("Input Bilangan 2 : ");
        int b = input.nextInt();
        
        System.out.println("");
        
        System.out.println(a + " * " +  b + " = " + perkalianRusia(a, b));
    }
}
