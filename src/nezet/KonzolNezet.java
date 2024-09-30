package nezet;

import java.util.Scanner;


public class KonzolNezet {
     private static final Scanner sc = new Scanner(System.in);

     public int bekeres() {
        megjelenit("Válaszd ki az egyiket:(1,2,3)");
        return sc.nextInt() -1;      
    }
     
     public void megjelenit(String uzenet) {
        System.out.println(uzenet);
    }
     
     public void bezar() {
        sc.close();
    }
}
