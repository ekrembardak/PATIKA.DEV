
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];
        int [][] transpose = new int[3][2];
        
        Scanner input = new Scanner(System.in);
        System.out.print("Matris : ");
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
