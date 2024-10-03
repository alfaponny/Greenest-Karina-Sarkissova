package Greenest;

public enum Liquid { //Enum som anger vätsketyp.
    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN("mineralvatten");


public final String liquid;

Liquid (String s){
  liquid = s;
}
}
