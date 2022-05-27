public class Main {
    public static void main(String[] args) {
        Fighter ekrem = new Fighter("Ekrem" , 15 , 100, 90, 0);
        Fighter fikret = new Fighter("Fikret" , 10 , 95, 100, 0);
        Match r = new Match(ekrem,fikret , 90 , 100);
        r.run();
    }
    }

