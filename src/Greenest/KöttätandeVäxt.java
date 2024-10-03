package Greenest;

import javax.swing.*;

public class KöttätandeVäxt extends Växter implements Bevattningsmetod{ //subklass, interface

    protected Liquid vätska = Liquid.PROTEINDRYCK;

    private double liquidAmount = 0.1+(0.2* this.getHöjd());

    public KöttätandeVäxt(String n, double h) {
        super(n, h);


    }

    @Override //här overridar Vattningsmetod() från Bevattningsmetod-interfacet.
    public void Vattningsmetod() { //här kallar jag på interfacet Bevattningsmetod. Vattningsmetod blir här också polymorfism, då den kallar på olika objekt och skapar olika resultat.

        JOptionPane.showMessageDialog(null, getNamn() + " behöver " + liquidAmount +" liter " + this.vätska.liquid);
    }

    public double getLiquidAmount() {
        return liquidAmount;
    }
}

