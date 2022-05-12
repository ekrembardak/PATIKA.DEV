
import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı: " );
        n1= input.nextInt();
        System.out.print("İkinci Sayı: ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();
        
        switch(select){
            case 1:
                System.out.println("Sonuç : " + (n1+n2));
                break;
        
            case 2:
                System.out.println("Sonuç : " + (n1-n2));
                break;
        
            case 3:
                System.out.println("Sonuç : " + (n1 * n2));
                break;
        
            case 4:
                System.out.println("Sonuç : " + (n1 / n2));
                break;
        default:
            System.out.println("Hatalı Seçim Yaptınız, Tekrar Deneyin...");
        }
        }
        }
        
   

    
}
