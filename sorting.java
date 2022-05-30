
import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int arrayLength;
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz : ");
        arrayLength = input.nextInt();
        int [] arr = new int[arrayLength];
        System.out.println("Dizinin elemanlarını giriniz : ");
        
        for(int i = 0; i < arrayLength ; i++) {
            System.out.print(i+1 + ". elemanı : ");
            numbers = input.nextInt();
            arr[i] = numbers;
        }
        
        for(int i = 0; i < arrayLength; i++){
            for(int j = i+1; j < arrayLength; j++){
                if(arr[j] < arr[i]){
                    int key = arr[i];
                    arr[i] = arr[j];
                    arr[j] = key;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
   
}
}
