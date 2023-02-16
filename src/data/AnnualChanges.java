package data;

import enums.CityStrategyEnum;

import java.util.ArrayList;

public class AnnualChanges {
    private Double newSantaBudget;
    private ArrayList<Gift> newGifts;
    private ArrayList<Child> newChildren;
    private ArrayList<Child> childrenUpdates;
    private Input input = null;
    private CityStrategyEnum strategy;

    public AnnualChanges() {
    }

    /**
     * getter pentru noul buget primit pentru noul an
     * @return
     */
    public Double getNewSantaBudget() {
        return newSantaBudget;
    }

    /**
     * setter pentru noul buget primit pentru noul an
     * @param newSantaBudget
     */
    public void setNewSantaBudget(final Double newSantaBudget) {
        this.newSantaBudget = newSantaBudget;
    }

    /**
     * getter pentru lista newGifts in care se retin toate cadourile noi adaugati
     * @return
     */
    public ArrayList<Gift> getNewGifts() {
        return newGifts;
    }

    /**
     * setter pentru lista newGifts in care se retin toate cadourile noi adaugati
     * @param newGifts
     */
    public void setNewGifts(final ArrayList<Gift> newGifts) {
        this.newGifts = newGifts;
    }

    /**
     * getter pentru lista newChildren in care se retin toti copii noi adaugati
     * @return
     */
    public ArrayList<Child> getNewChildren() {
        return newChildren;
    }

    /**
     * setter pentru lista newChildren in care se retin toti copii noi adaugati
     * @param children
     */
    public void setNewChildren(final ArrayList<Child> children) {
        this.newChildren = children;
    }

    /**
     * getter pentru lista childrenUpdates in care se retin toate modificarile aduse
     * copiilor din annualChanges
     * @return
     */
    public ArrayList<Child> getChildrenUpdates() {
        return childrenUpdates;
    }

    /**
     * setter pentru lista childrenUpdates in care se retin toate modificarile aduse
     * copiilor din annualChanges
     * @param childrenUpdates
     */
    public void setChildrenUpdates(final ArrayList<Child> childrenUpdates) {
        this.childrenUpdates = childrenUpdates;
    }

    /**
     * getter pentru strategy in care se retine noua strategie pentru anul respectiv
     * @return
     */
    public CityStrategyEnum getStrategy() {
        return strategy;
    }

    /**
     * setter pentru strategy in care se retine noua strategie pentru anul respectiv
     * @param strategy
     */
    public void setStrategy(final CityStrategyEnum strategy) {
        this.strategy = strategy;
    }

    /**
     * metoda toString pentru afisarea continutului clasei AnnualBudget
     * @return
     */
    @Override
    public String toString() {
        return "AnnualChanges{"
                + "newSantaBudget="
                + newSantaBudget + ", newGifts="
                + newGifts + ", newChildren="
                + newChildren + ", childrenUpdates="
                + childrenUpdates + ", input="
                + input + '}';
    }
}
