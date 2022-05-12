import java.util.Scanner;
public class kullaniciGirisi {

	public static void main(String[] args) {
                String username,password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adınız : ");
		username=input.nextLine();
		System.out.print("Şifreniz : ");
		password=input.nextLine();
		
		if(username.equals("patika")&& password.equals("java123"))
			System.out.println("Giriş Yaptınız! ");
		
		else
			{System.out.println("Bilgileriniz Yanlış!\nŞifrenizi sıfırlamak istiyor musunuz?(evet için 1, hayır için 0 giriniz): ");
			int yenile=input.nextInt();
			
			
			if(yenile==1)
			{
				Scanner in=new Scanner(System.in);
				System.out.print("Yeni Şifreniz:");
				String yeniPassword=in.nextLine();
			
				if(yeniPassword.equals("java123"))
					{System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");}
				
				else
					{System.out.print("Şifre oluşturuldu.");}
			in.close();
			}
			else if(yenile==0) {System.out.print("Şifre değiştirilmedi");}
			
			else {System.out.print("Hatalı giriş yaptınız.Tekrar deneyin!");}
			}
		}
	}