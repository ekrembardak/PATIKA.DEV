
import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int x = n - 1; x >= 1; x--) {
            for (int y = (n - x); y >= 1; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }


    
        

   

    
