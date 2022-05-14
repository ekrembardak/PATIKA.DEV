
import java.util.Scanner;

public class usluSayillar {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır değer giriniz: ");
        k = input.nextInt();
        
        for(int i = 1; i <= k; i *=4){
            System.out.println("4'ün kuvvetleri: " + i);
        }
        System.out.println("**********************************");
        for(int i = 1; i <= k; i *=5) {
            System.out.println("5'in kuvvetlerii: " + i);
        }
   
}
    
}
