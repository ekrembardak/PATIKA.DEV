
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class gelismisHesapMakinesi {
    static int sum(int a , int b){
        int result = a+ b;
        System.out.println("Toplama: " + result);
        return result;
        
    }
    static int minus(int a , int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }
    static int times(int a , int b){
        int result = a * b;
        System.out.println("Çarpma : " + result);
        return result;
    }
    static int divided(int a , int b){
        if (b == 0){
            System.out.println("İkinci sayı 0'dan büyük olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme : " + result);
        return result;
    }
    static int power(int a , int b) {
        int result = 1;
        for(int i = 1; i <= b ; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a , int b) {
        return a%b;

    }
    static void rectangle(int a , int b) {
        System.out.println("Çevresi : " + (2*(a+b)));
        System.out.println("Alanı : " + a*b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        
        String menu = "1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n5-Üslü Sayı Alma\n6-Mod Alma\n7-Dikdörtgen Alan ve Çevre Hesabı\n0-Çıkış Yap";
        System.out.println(menu);
        while(true) {
            
            System.out.print("İşlem Seçiniz: ");
            select = input.nextInt();
            if(select == 0) {
                System.out.println("Güle güle");
                break;
            }
            System.out.print("Birinci Sayı: ");
            int a = input.nextInt();
            System.out.print("İkinci Sayı: ");
            int b = input.nextInt();
            
            switch(select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs hesabı : " + power(a, b));
                    break;
                case 6:
                    System.out.println("Mod : " + mod(a, b));
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }

   
}
    
}
