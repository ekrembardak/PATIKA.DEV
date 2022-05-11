
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double armutkgfiyat = 2.14;
        double elmakgfiyat = 3.67;
        double domateskgfiyat = 1.11;
        double muzkgfiyat = 0.95;
        double patlicankgfiyat = 5.00;
        
        double armutkg, elmakg, domateskg, muzkg, patlicankg, toplam;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kg armut aldınız? : ");
        armutkg = input.nextDouble();
        System.out.print("Kaç kg elma aldınız? : ");
        elmakg = input.nextDouble();
        System.out.print("Kaç kg domates aldınız? : ");
        domateskg = input.nextDouble();
        System.out.print("Kaç kg muz aldınız? : ");
        muzkg = input.nextDouble();
        System.out.print("Kaç kg patlican aldınız? : ");
        patlicankg = input.nextDouble();
        
        toplam = (armutkg * armutkgfiyat) + (elmakg * elmakgfiyat) + (domateskg * domateskgfiyat) + (muzkg * muzkgfiyat) + (patlicankg * patlicankgfiyat);
        
        System.out.println("Toplam ödemeniz gereken tutar : " + toplam + "TL");
        
        
        
   
}
    
}
