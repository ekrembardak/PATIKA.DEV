
import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        int dogumTarihi;
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Tarihinizi Giriniz: ");
        dogumTarihi = input.nextInt();
        
        if(dogumTarihi%12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        }
        else if(dogumTarihi%12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }
        else if(dogumTarihi%12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        }
        else if(dogumTarihi%12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }
        else if(dogumTarihi%12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }
        else if(dogumTarihi%12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        }
        else if(dogumTarihi%12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }
        else if(dogumTarihi%12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        }
        else if(dogumTarihi%12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }
        else if(dogumTarihi%12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        }
        else if(dogumTarihi%12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }
        else if(dogumTarihi%12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
        else {
            System.out.println("0'dan büyük bir sayı giriniz.");
        }
        
      
   
}
    
}
