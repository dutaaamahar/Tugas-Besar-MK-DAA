package praktikum;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Array : ");
        int a = input.nextInt();
        
        String array[] = new String[a];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array ke-" + (i + 1) + " : ");
            array[i] = input.next();
        }
        
        System.out.print("Array = { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i]) + " ");
        }
        System.out.print("}");
    }
}
