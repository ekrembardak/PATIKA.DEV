
import java.util.Scanner;

public class recursiveAsalSayi {
    static boolean asalMi(int number) {
        int sayac = 0;
        for(int i = 2; i < number; i++){
            if (number % i == 0) {
                sayac++;
            }
            else if (number < 2) {
                System.out.println("Girilen sayı asal değildir.");
            }
    }
        if(sayac == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        if(asalMi(number)) {
            System.out.println("Girilen sayı bir asal sayıdır");
        }
        else {
            System.out.println("Girilen sayı asal değildir.");
        }
   
}
    
}
