package data;

import enums.Category;

import java.util.ArrayList;

public class ChildrenUpdates {
    private Integer id;
    private Double niceScore;
    private ArrayList<Category> giftsPreferences;

    public ChildrenUpdates(final Integer id, final Double niceScore,
                           final ArrayList<Category> giftsPreferences) {
        this.id = id;
        this.niceScore = niceScore;
        this.giftsPreferences = giftsPreferences;
    }

    public ChildrenUpdates() {

    }

    /**
     * getter pentru id in care se retine id-ul copilului care sufera modificari
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * setter pentru id in care se retine id-ul copilului care sufera modificari
     * @param id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    /**
     * getter pentru niceScore in care se retine noul scor, daca acesta exista
     * @return
     */
    public Double getNiceScore() {
        return niceScore;
    }

    /**
     * setter pentru niceScore in care se retine noul scor, daca acesta exista
     * @param niceScore
     */
    public void setNiceScore(final Double niceScore) {
        this.niceScore = niceScore;
    }

    /**
     * getter pentru lista giftsPreferences in care sunt retinute preferintele copilului
     * @return
     */
    public ArrayList<Category> getGiftsPreferences() {
        return giftsPreferences;
    }

    /**
     * setter pentru lista giftsPreferences in care sunt retinute preferintele copilului
     * @param giftsPreferences
     */
    public void setGiftsPreferences(final ArrayList<Category> giftsPreferences) {
        this.giftsPreferences = giftsPreferences;
    }

    /**
     * metoda toString pentru afisarea continutului clasei ChildrenUpdates
     * @return
     */
    @Override
    public String toString() {
        return "ChildrenUpdates{"
                + "id=" + id
                + ", niceScore=" + niceScore
                + ", giftsPreferences=" + giftsPreferences
                + '}';
    }
}
