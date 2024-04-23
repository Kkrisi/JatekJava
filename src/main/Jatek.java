package main;

import java.util.Random;

public class Jatek {

    /* ADATTAGOK */
    private static Random rnd = new Random();
    private static final int MAX = 9;
    
    /* TAGFÜGGVÉNYEK */
    public static int getMAX(){
        return MAX;
    }
 /* KONSTRUKTOR, jellemzői:
       - ua. a neve, mint az osztálynak
       - nincs típusa, void sem
       - akkor is van, ha nem írtuk meg, ez az alapértelmezett kstr.
     */

    public Jatek() {
        start();
    }

    public void start() {
        System.out.printf("Gondoltam egy számra, 0 és %d között...".formatted(MAX));

        int szam = rnd.nextInt(MAX+1);
        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        Jatekos jatekos3 = new Jatekos();
        boolean joTipp1, joTipp2, joTipp3;
        boolean vanNyertes;

        do {
            System.out.println("\na kitalálandó szám: " + szam);

            jatekos1.tippel();
            jatekos2.tippel();
            jatekos3.tippel();

            System.out.println("1. játékos tippje: " + jatekos1.getTipp());
            System.out.println("2. játékos tippje: " + jatekos2.getTipp());
            System.out.println("3. játékos tippje: " + jatekos3.getTipp());

            joTipp1 = jatekos1.getTipp() == szam;
            joTipp2 = jatekos2.getTipp() == szam;
            joTipp3 = jatekos3.getTipp() == szam;
            vanNyertes = joTipp1 || joTipp2 || joTipp3;
            if (!vanNyertes) {
                System.out.println("A játékosok újra próbálkoznak!");
            }
        } while (!vanNyertes);
        System.out.println("Van nyertes!");
        
        System.out.println("1. játékos tippje: " + joTipp1);
        System.out.println("2. játékos tippje: " + joTipp2);
        System.out.println("3. játékos tippje: " + joTipp3);
        System.out.println("Játék vége!");
    }

}
