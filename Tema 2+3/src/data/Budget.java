package data;

import java.util.List;

public final class Budget {

    private Double budgetValue;
    private Double totalBudget;

    public Budget(final Double totalBudget) {
        this.totalBudget = totalBudget;
    }

    /**
     * getter pentry metoda computeBudgetUnit care calculeaza unitatea de buget
     * @return
     */
    public Double getBudgetUnit() {
        return budgetValue;
    }

    /**
     * metoda pentru calcularea unitatii de buget
     * @param children
     */
    public void computeBudgetUnit(final List<Child> children) {
        double value;
        double averageSum = 0.0d;
        for (int i = 0; i < children.size(); i++) {
            children.get(i).score();
            averageSum += children.get(i).averageScore();
        }

        value = totalBudget / averageSum;

        this.budgetValue = value;
    }

}
