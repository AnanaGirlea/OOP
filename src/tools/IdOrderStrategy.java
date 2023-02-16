package tools;


import data.Child;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdOrderStrategy implements AnnualStrategy {

    /**
     * metoda implementata din interfata AnnualStrategy
     * metoda aplica strategia in functie de id
     * @param children
     * @return
     */
    @Override
    public List<Child> execute(final List<Child> children) {
        Collections.sort(children, new IdComparator());
        return children;
    }

    public class IdComparator implements Comparator<Child> {
        /**
         * metoda care ordoneaza lista de copii dupa id-ul fiecarui copil
         * @param a
         * @param b
         * @return
         */
        public int compare(final Child a, final Child b) {
            return a.getId() - b.getId();
        }
    }

}
