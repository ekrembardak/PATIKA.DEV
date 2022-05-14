
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        number = input.nextInt();
        int sonuc = 0;
        int kalan;

        while (number !=0){
            kalan = number%10;
            number /= 10;
            sonuc += kalan;

        }
        System.out.println("Girilen Sayilerin Basamak Toplami: " + sonuc);



    }
    
}
