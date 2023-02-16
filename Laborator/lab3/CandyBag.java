package Lab3;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> cutii = new ArrayList<>();

    public CandyBag (ArrayList<CandyBox> cutii){
        this.cutii = cutii;
    }

    public ArrayList<CandyBox> getCutii() {
        return cutii;
    }

    public void setCutii(ArrayList<CandyBox> cutii) {
        this.cutii = cutii;
    }
}
