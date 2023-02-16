package Lab3;

import java.util.ArrayList;

public class Area {
    private CandyBag cutie;
    private int nr;
    private String street;

    public Area(){}

    public Area(CandyBag cutie, int nr, String street) {
        this.cutie = cutie;
        this.nr = nr;
        this.street = street;
    }

    void getBirthdayCard(){
        System.out.println("\n Aresa: strada " + this.street +
                            " nr " + this.nr +
                            "\n LA MULTI ANI! \n");

        for(CandyBox i: this.cutie.getCutii() ){
            System.out.println(i.toString());
            /*
            if(i instanceof Baravelli)
                ((Baravelli) i).printBaravelliDim();
            if(i instanceof Lindt)
                ((Lindt)i).printLindtDim();
            if(i instanceof ChocAmor){
                ((ChocAmor)i).printChoAmorDim();
            */
            i.print();
        }
    }

    public CandyBag getCutie() {
        return cutie;
    }

    public void setCutie(CandyBag cutie) {
        this.cutie = cutie;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
