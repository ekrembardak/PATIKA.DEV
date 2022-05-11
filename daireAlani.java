
import java.util.Scanner;

public class daireAlani {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double a;
        double alan;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextDouble();
        
        alan = (pi*(r*r)*a)/360;
        System.out.print("Dairenin Alanı ; " + alan);
        
        
        
   
}
    
}
