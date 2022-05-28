public class harmonikSayilarDizi {
    public static void main(String[] args) {
        int [] list = {1,2,3,4,5};
        double sum = 0.0;
        
        for (double i : list) {
            sum += (i/1);
        }
        
        double avarage = list.length / sum;
        System.out.println("Harmonik Sayı Ortalaması : " + avarage);
   
}
    
}
