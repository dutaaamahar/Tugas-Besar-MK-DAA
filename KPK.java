package praktikum;

public class KPK {
    
    public static int kpk(int x, int y) {
        int a = x;
        int b = y;
        
        while (a != b) {
            if (a < b) {
                a = a + x;
            } else {
                b = b + y;
            }
        }
        
        return a;
    }
    
    public static void main(String args[]) {
        int KPK = kpk(48, 66);
        
        System.out.println(KPK);
    }
}
