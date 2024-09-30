package modell;

import java.util.Scanner;

public class Jatek {
    
    private static final Scanner sc = new Scanner(System.in);
    private Lada[] ladak;
    private int valasztas;
    
    public Jatek(){
        valasztas = -1;
        ladak = new Lada[3];
        ladak[0]= new Lada("arany", "Én rejtem a kincset");
        ladak[1]= new Lada("ezüst", "Nem én rejtem a kincset", true);
        ladak[2]= new Lada("bronz", "Arany hazudik");
        
        megjelenit(kezdes());
        bekeres();
        megjelenit(ellenorzes());
        vege();
    }

    public String kezdes() {
        String s= "Hol a kincs? Csak az egyik igaz!";
        int i=1;
        for (Lada lada : ladak) {
            String a = lada.getAnyag();
            String f = lada.getFelirat();
            s+= i++ + ". " + a + "láda: " + f + "\n";
        }
        return s;
        
    }

    private void bekeres() {
        megjelenit("Válaszd ki az egyiket:(1,2,3)");
        valasztas = sc.nextInt();
        
         sc.close();
        
    }
    

    private void megjelenit(String uzenet) {
        System.out.println(uzenet);
    }

    private String ellenorzes() {
        String s = "Gratulálok, eltaláltad!";
        s = ladak[valasztas].isKincs() ? s : "Sajnos nem talált";
        
       
        
        return s;
        
        
        
    }

    private void vege() {
        sc.close();
    }
}
