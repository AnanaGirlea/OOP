package Lab3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        CandyBox nr1 = new Lindt("ciocolata", "Romania", 1f, 2f, 3f);
        CandyBox nr2 = new Baravelli("praline", "SUA", 3f, 2f);
        CandyBox nr3 = new ChocAmor("nugat", "Germania", 3f);

        ArrayList<CandyBox> cutie = new ArrayList<>();
        cutie.add(nr1);
        cutie.add(nr2);
        cutie.add(nr3);

        CandyBag PinkPanda = new CandyBag(cutie);
        Area zona = new Area(PinkPanda,8, "Bd Sincai");
        zona.getBirthdayCard();
    }
}
