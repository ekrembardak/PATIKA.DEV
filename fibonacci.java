
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number , n1 = 0, n2 =1, n3 = 0, x = 0;
        System.out.print("Eleman sayısı:");
        number = input.nextInt();

        while (x < number){
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            x++;
        }

        }
    
}
