
import java.util.Random;
import java.util.Scanner;

public class sayıTahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected ;
        boolean isWin = false;
        
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();
            
            if (selected < 0 || selected > 99) {
                System.out.println("0 ile 99 arasında bir sayı girmelisiniz!");
                continue;
            }
            
            if(selected == number) {
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz. Sayı: " + number);
                break;
            }
            else {
                System.out.println("Tahmininiz yanlış.");
                System.out.println("Kalan Hak: " + (5-right));
                if(selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür");
                }
                else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür");
                }
            }
            right++;
        }
        if(!isWin){
            System.out.println("Kaybettiniz!");
        }
}
    
}
