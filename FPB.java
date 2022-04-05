package praktikum;

public class FPB {
    
    public static int fpb(int x, int y) {
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
    
    public static void main(String args[]) {
        int FPB = fpb(48, 66);
        
        System.out.println(FPB);
    }
}
