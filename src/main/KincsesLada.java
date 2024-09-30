

package main;

import modell.JatekModell;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;
import vezerlo.FelugoVezerlo;


public class KincsesLada {


    public static void main(String[] args) {
        JatekModell modell = new JatekModell();
//        KonzolNezet nezet = new KonzolNezet();
//        new KonzolVezerlo(modell, nezet);
        
        FelugroNezet nezet1 = new FelugroNezet();
        new FelugoVezerlo(modell, nezet1);
    }
    
}
