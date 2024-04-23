package main;

import java.util.Random;

public class Jatekos {
    
    /* ADATTAGOK */
    private static final Random rnd = new Random();
    private int tipp;
    
    /* TAGFÜGGVÉNYEK */
    public void tippel(){
        tipp = rnd.nextInt(Jatek.getMAX()+1);
        System.out.println("tippelésem: " + tipp);
    }
    
    public int getTipp(){
        return tipp;
    }
}
