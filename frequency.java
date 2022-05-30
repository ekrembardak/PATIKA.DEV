
import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int [] array = {1,2,4,1,2,12,6,4,1,9,7,6,5,4,1};
        int [] freq = new int[array.length];
        
        for (int i = 0; i < array.length; i++)
            freq[i] = 1;
        
        for (int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                if((i != j) && (array[i] == array[j])) {
                    freq[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (freq[i] > 1) {
                if (array[i] != 0)
                    System.out.println(array[i] + " sayisi " + freq[i] + " kere tekrar edildi.");
            }
        }
    }
   
}
