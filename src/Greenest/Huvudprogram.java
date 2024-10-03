package Greenest;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    Huvudprogram() {


        List<Växter> namnLista = new ArrayList<>();
        Växter Laura = new Palm("Laura", 5); //polymorfism. Här lägger jag till värden superklassen Växter,
        Växter Olof = new Palm("Olof", 1);     //och skapar ett objekt i en subklass.
        Växter MeatLoaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växter Igge = new Kaktus("Igge", 0);

        namnLista.add(Laura);
        namnLista.add(Olof);
        namnLista.add(MeatLoaf);
        namnLista.add(Igge);

        while (true) {
            String användarInput = JOptionPane.showInputDialog("Vilken växt ska vattnas? ");
            if (användarInput == null)
            {
                break;
            }
            boolean växtHittad = false;

            for (Växter växt : namnLista) {
                if (växt.getNamn().equalsIgnoreCase(användarInput))
                {
                    växt.Vattningsmetod();
                    växtHittad = true;
                    break;
                }
            }
            if (!växtHittad) {
                JOptionPane.showMessageDialog(null, "Växten " + användarInput + " hittades tyvärr inte");
            }


        }
    }


    public static void main(String[] args) {

        Huvudprogram main = new Huvudprogram();
    }
}


