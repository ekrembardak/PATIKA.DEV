
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int x,y ;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        x = input.nextInt();
        System.out.print("İkinci Sayı: ");
        y = input.nextInt();
        int i = 1, j = 1, ebob = 1, ekok = 1;
        
        while(i<x && i <y) {
            if(x%i==0 && y%i==0){
                ebob=i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);
        ekok = (x*y)/ebob;
        System.out.println("Ekok" + ekok);
        
   
}
    
}
