
import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double m, kg, vki;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz : ");
        m = input.nextDouble();
        System.out.print("Kilonuz : ");
        kg = input.nextDouble();
        
        vki = kg / (m * m);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
        
   
}
    
}
