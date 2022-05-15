
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int n, number, min , max ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        n = input.nextInt();
        
        for(int i = 1; i<= n; i++) {
            System.out.print(i + ".nci sayıyı giriniz : ");
            number = input.nextInt();
            
            if(i == 1) {
                min = number;
                max = number;
            }
            else {
                if(number > max) {
                    max = number ;
                }
                else{
                    min = number ;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
   
}
    
}
