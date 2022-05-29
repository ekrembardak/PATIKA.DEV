
import java.util.Arrays;

public class arraylist {

        static boolean isFind(int[] arr, int value) {
            for(int i = 0; i < arr.length; i++){
                if(value == arr[i]) {
                    return true;
                }
            }
            return false;
            
        }
        
        public static void main(String[] args) {
            int [] list = {1,5,3,1,2,6,2,6,2,3,3,5};
            int [] repeat = new int[list.length];
            int startIndex = 0;
            for(int i = 0; i < list.length;i++) {
                for(int j = 0; j < list.length;j++) {
                    if(list[i] == list[j] && i != j){
                        if(!isFind(repeat, list[i])) {
                            repeat[startIndex++] = list[i];    
                        }
                        
                    }
                }
            }
            for(int i = 0; i < repeat.length;i++) {
                
                if (repeat[i] != 0 && repeat[i]%2 == 0) {
                    System.out.print(repeat[i] + " ");
                }
                
            }
        }
}

