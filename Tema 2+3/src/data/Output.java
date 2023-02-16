package data;

import java.util.ArrayList;
import java.util.List;

public class Output {

    private List<OutputYear> annualChildren;

    public Output() {
        annualChildren = new ArrayList<OutputYear>();
    }

    /**
     * getter pentru list annualChildren in care se retin listele de copii din toti anii
     *
     * @return
     */
    public List<OutputYear> getAnnualChildren() {
        return annualChildren;
    }

    /**
     * setter pentru list annualChildren in care se retin listele de copii din toti anii
     *
     * @param perYear
     */
    public void setAnnualChildren(final List<List> perYear) {
        //this.annualChildren = annualChildren;
        for (int i = 0; i < perYear.size(); i++) {
            List<List> list = perYear.get(i);
            for (int j = 0; j < list.size(); j++) {

                List outputYear = list.get(j);

                OutputYear year = new OutputYear(outputYear);
                this.annualChildren.add(year);
            }

        }
    }

    /**
     * Metoda toString pentru afisarea continutului clasei Output
     *
     * @return
     */
    @Override
    public String toString() {
        return "Output{"
                + "annualChildren=" + annualChildren
                + '}';
    }
}
