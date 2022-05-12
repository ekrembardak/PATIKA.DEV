
import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya,turkce,muzik;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.println("Müzik Notunuz : ");
        muzik = input.nextInt();
        
        double avarage = ((mat+fizik+kimya+turkce+muzik)/5);
        
        if(avarage <= 55) {
            System.out.println("Ortalamanız yetersiz, sınıfta kaldınız");
         
        }
        else {
            System.out.println("Sınıfı Geçtiniz...");
            
        }
   
}
    
}
