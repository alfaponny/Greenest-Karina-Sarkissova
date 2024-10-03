package Greenest;

abstract class Växter { //Superklass
    private String namn; //här använder jag inkapsling och gör Växters variabler private.
    private double höjd; //detta för att de inte ska kunna bli ändrade av andra klasser.


    public Växter(String n, double h) {
        this.namn = n;
        this.höjd = h;
    }

    public String getNamn() { //getter här gör att man kan komma åt de privata variablerna.
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }


public abstract void Vattningsmetod();

}
