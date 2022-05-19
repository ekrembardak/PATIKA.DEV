
import java.util.Scanner;

public class deseneGoreMetot {
    static int desenMetot(int number, int temp, int turn) {
        if(turn == 1) {
            System.out.println(temp + " ");
            temp -= 5;
            if(temp <= number) {
                turn = 0;
            }
        }
        else {
            System.out.println(temp + " ");
            temp+= 5;
            if(temp == number);
            return number;
        }
        return desenMetot(number, temp, turn);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int temp = number;
        int turn = 1;
        System.out.println("Çıktısı: ");
        System.out.println(desenMetot(number, temp, turn));
        
        input.close();
}
    
}
