import java.util.Scanner;
public class numberofDigits {
    public static void main(String[] args) {
        int k,sum=0;
        boolean istrue=true;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz:");
            k=input.nextInt();
            if (k%4==0){
                sum +=k;
            } else if (k%2==1 || k<0) {
                istrue=false;
            }
        }while(istrue);

        System.out.println("Toplamı:"+sum);
    }
}