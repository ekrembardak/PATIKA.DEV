
import java.util.Scanner;

public class tamBolen {
    public static void main(String[] args) {
        int k, value = 0;
        double avarage = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        k = input.nextInt();
        
        for(int i=0; i <= k ; i++) {
            if(i%3 == 0 && i%4 == 0){
                avarage +=i;
                value++;
                
            }
        }
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: "+ (avarage/value));
   
}
    
}
