
import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp = new Scanner(System.in);
        int right = 3, balance = 1500, select = 0, price = 0;
        
        while(right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Bankamıza Hoşgeldiniz");
                while(select != 4){
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Seçim Yapınız: ");
                    select = inp.nextInt();
                    
                    switch(select){
                        case 1:
                            System.out.print("Yatırılacak tutarı giriniz: ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            price = inp.nextInt();
                            balance -= price;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        default:
                            System.out.println("Yanlış bir seçim yaptınız");
                            break;
                        
                        
                    }
                }
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } 
                else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
   

    

