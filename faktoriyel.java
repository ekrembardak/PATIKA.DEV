
import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        int n, r, f1 = 1, f2 = 1, f3 = 1, total;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci sayının: ");
        n = input.nextInt();
        System.out.print(" İkinci sayılı kombinasyonu : ");
        r = input.nextInt();
        
        for(int i = 1; i <= n; i++) {
            f1 = f1 * i;
        }
        for (int j = 1; j <= r; j++) {
            f2 = f2 * j;
        }
        for (int k = 1; k <= (n-r); k++) {
            f3 = f3 * k;
        }
        total = (f1/(f2*f3));
        System.out.println(n + " sayısının " + r + "  'li kombinasyonu "+ total + " 'dir.");
            
   
}
    
}
