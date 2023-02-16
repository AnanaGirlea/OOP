package tools;

import data.Child;

import java.util.List;

public class AnnualContext {

    private AnnualStrategy strategy;

    public AnnualContext(final AnnualStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * metoda care intoarce lista de copii dupa ce a fost aplicata strategia
     * @param children
     * @return
     */
    public List<Child> executeStrategy(final List<Child> children) {

        List<Child> result = strategy.execute(children);
        return result;
    }
}
