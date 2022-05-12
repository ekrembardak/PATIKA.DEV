
import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int km, yas, yolculukTipi ;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz(Km) : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = input.nextInt();
        double tutar = 0;
        if (km >0) {
            tutar = km * 0.10;
        }
        else {
            System.out.println("Mesafe(Km) 0'dan Küçük Olamaz");
        }
        
        if (yas > 0 ) {
            if (yas <12) {
                tutar -= (tutar*0.5);
                
            }
            else if ((yas >= 12)&& (yas <= 24)) {
                tutar -= (tutar*0.10);
                
            }
            else if (yas >= 65 ) {
                tutar -= (tutar*0.30);
                
            }
            
        }
        else {
            System.out.println("Hatalı veri girdiniz. Yaş için 0'dan büyük bir değer giriniz.");
        }
        
         if ((yolculukTipi == 1) || (yolculukTipi == 2)){
            if (yolculukTipi == 2){
                tutar -= (tutar * 0.2);
                tutar *= 2;
            }
        }
        else{
            System.out.println("Lutfen yolculuk tipi icin 1 veya 2 degerini giriniz!");
        }
         System.out.println("Toplam Tutar : " + tutar + "TL");
}
    
}
