package data;

import enums.Cities;

public class CityScore {

    private Cities name;
    private int count;
    private double score;
    private int sum = 0;
    private double average;


    public CityScore(final Cities name, Double score) {
        this.name = name;
        if (score == null) {
            score = 0.0;
        }
        this.count++;
        this.sum += count;
        this.score = score * count;
        this.average = score / sum;
    }

    /**
     * metoda pentru calcuarea mediei aritmetici
     * @param add
     */
    public void addScore(Double add) {
        if (add == null) {
            add = 0.0;
        }
        count++;
        score += add * count;
        sum += count;
        average = score / sum;
    }

    /**
     * getter pentru name in care se retine numele orasului
     * @return
     */
    public Cities getName() {
        return name;
    }

    /**
     * setter pentru name in care se retine numele orasului
     * @param name
     */
    public void setName(final Cities name) {
        this.name = name;
    }

    /**
     * getter pentru count in care se retine numarul de copii dintr-un oras
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * setter pentru count in care se retine numarul de copii dintr-un oras
     * @param count
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * getter pentru score in care se retine scorul orasului
     * @return
     */
    public double getScore() {
        return score;
    }

    /**
     * setter pentru score in care se retine scorul orasului
     * @param score
     */
    public void setScore(final double score) {
        this.score = score;
    }

    /**
     * getter pentru average in care se retine average scorul orasului
     * @return
     */
    public double getAverage() {
        return average;
    }

    /**
     * metoda toString pentru afisarea continutului clasei CityScore
     * @return
     */
    @Override
    public String toString() {
        return "CityScore{"
                + "name=" + name
                + ", count=" + count
                + ", score=" + score
                + ", average=" + average
                + '}';
    }
}
