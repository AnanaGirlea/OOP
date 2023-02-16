package data;

import java.util.ArrayList;

public class Input {
    private Integer numberOfYears;
    private Double santaBudget;
    private InitialData initialData;
    private ArrayList<AnnualChanges> annualChanges;

    public Input(final Integer numberOfYears, final Double  santaBudget,
                  final InitialData initialData, final ArrayList<AnnualChanges> annualChanges) {
        this.numberOfYears = numberOfYears;
        this.santaBudget = santaBudget;
        this.initialData = initialData;
        this.annualChanges = annualChanges;
    }

    public Input() {
    }

    /**
     * getter pentru numberOfYears in care se retine numarul de ani pe care trebuie sa ii parcurgem
     * @return
     */
    public Integer getNumberOfYears() {
        return numberOfYears;
    }

    /**
     * setter pentru numberOfYears in care se retine numarul de ani pe care trebuie sa ii parcurgem
     * @param numberOfYears
     */
    public void setNumberOfYears(final Integer numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /**
     * getter pentru santaBudget in care se retine bugetul mosului pe anul respectiv
     * @return
     */
    public Double getSantaBudget() {
        return santaBudget;
    }

    /**
     * setter pentru santaBudget in care se retine bugetul mosului pe anul respectiv
     * @param santaBudget
     */
    public void setSantaBudget(final Double santaBudget) {
        this.santaBudget = santaBudget;
    }

    /**
     * getter pentru initialData in care se retin listele cu toti copii si toate jocurile
     * @return
     */
    public InitialData getInitialData() {
        return initialData;
    }

    /**
     * setter pentru initialData in care se retin listele cu toti copii si toate jocurile
     * @param initialData
     */
    public void setInitialData(final InitialData initialData) {
        this.initialData = initialData;
    }

    /**
     * getter pentru lista annualChanges in care se retin toate scimbarile de-a lungul anilor
     * @return
     */
    public ArrayList<AnnualChanges> getAnnualChanges() {
        return annualChanges;
    }

    /**
     * setter pentru lista annualChanges in care se retin toate scimbarile de-a lungul anilor
     * @param anualChanges
     */
    public void setAnnualChanges(final ArrayList<AnnualChanges> anualChanges) {
        this.annualChanges = anualChanges;
    }
}
