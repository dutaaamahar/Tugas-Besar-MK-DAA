package praktikum;

import java.util.Arrays;

public class insertSort {

    public static void insertionSort(int[] testArray) {
        for (int i = 1; i < testArray.length; i++) {
            int j = i - 1;
            int key = testArray[i];
            
            System.out.println("\nIterasi " + i);
            System.out.println(Arrays.toString(testArray) + ", KEY : " + key);
            
            while (j >= 0 && testArray[j] > key) {
                testArray[j + 1] = testArray[j];
                j--;
                
                System.out.println(Arrays.toString(testArray) + " <--- geser posisi " + testArray[j + 1]);
            }
            testArray[j + 1] = key;
            
            System.out.println(Arrays.toString(testArray) + " <--- " + key + " menempati posisi yang kosong");
        }
    }
    
    public static void main(String args[]) {
        int[] data = {7, 6, 1, 2};
        
        System.out.println("Data awal : " + Arrays.toString(data));
        
        insertionSort(data);
        System.out.println("\nData terurut : " + Arrays.toString(data));
    }
}
