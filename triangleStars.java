
import java.util.Scanner;

public class triangleStars {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(n-i)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
   
}
    
}
