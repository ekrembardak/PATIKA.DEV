
import java.util.Scanner;

public class recursiveUsluSayi {
    static int usAl(int taban, int us) {
        if (us == 0) {
           return 1;
        }
        else if (taban == 1) {
            return 1;
        } 
        else {
            return taban * usAl(taban, us -1);
        }
            
        
        
    }
    public static void main(String[] args) {
        int taban, us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = input.nextInt();
        System.out.println("Sonuç: " + usAl(taban, us));
   
}
    
}
