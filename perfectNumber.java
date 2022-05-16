
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int n = 1, k = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        n = input.nextInt();
        for(int i = 1; i < n; i++) {
            if(n%i==0){
                 k += i;
            }
        }
        if (n == 1) {
            System.out.println(n + " Mükemmel sayı değildir");
        }
        else if (k == n) {
            System.out.println( n + " Mükemmel sayıdır");
        }
        else {
            System.out.println( n + " Mükemmel sayı değildir");
        }
    }


    

