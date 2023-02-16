package data;

import enums.CityStrategyEnum;

import java.util.ArrayList;

public class InitialData {
    private ArrayList<Child> children;
    private ArrayList<Gift> santaGiftsList;
    private CityStrategyEnum strategy = CityStrategyEnum.ID;

    public InitialData(final ArrayList<Child> children, final ArrayList<Gift>
            gift) {
        this.children = children;
        this.santaGiftsList = gift;
    }

    public InitialData() {

    }

    /**
     * getter pentru lista children in care se retin toti copii din baza de date
     * @return
     */
    public ArrayList<Child> getChildren() {
        return children;
    }

    /**
     * setter pentru lista children in care se retin toti copii din baza de date
     * @param children
     */
    public void setChildren(final ArrayList<Child> children) {
        this.children = children;
    }

    /**
     * getter pentru lista gift in care se retin toate cadourile din baza de date
     * @return
     */
    public ArrayList<Gift> getSantaGiftsList() {
        return santaGiftsList;
    }

    /**
     * setter pentru strategy in care se retine strategia aplicata
     * @param strategy
     */
    public void setStrategy(final CityStrategyEnum strategy) {
        this.strategy = strategy;
    }

    /**
     * getter pentru strategy in care se retine strategia aplicata
     * @return
     */
    public CityStrategyEnum getStrategy() {
        return this.strategy;
    }

    /**
     * metoda toString pentru afisarea continutului clasei InitialData
     * @return
     */
    @Override
    public String toString() {
        return "InitialData{"
                + "children=" + children
                + ", gift=" + santaGiftsList
                + '}';
    }
}
