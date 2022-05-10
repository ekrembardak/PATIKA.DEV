
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        a = input.nextInt();
        System.out.print("b: ");
        b = input.nextInt();

        c = (double) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print("Hipotenüs: " + c);

        double u = (a+b+c)/2;
        System.out.print("\nÜçgenin Cevresi: " + 2*u);
        System.out.print("\nÜçgenin Alani: " + (int) Math.sqrt(u * (u-a) * (u-b) * (u-c)));
   
}
    
}
