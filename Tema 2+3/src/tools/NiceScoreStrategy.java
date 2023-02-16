package tools;

import data.Child;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NiceScoreStrategy implements AnnualStrategy {
    /**
     * metoda implementata din interfata AnnualStrategy
     * metoda aplica strategia in functie de scorul mediu al fiecarui copil (average score)
     * @param children
     * @return
     */
    @Override
    public List<Child> execute(final List<Child> children) {
      Comparator c = Collections.reverseOrder(new NiceScoreStrategy.NiceScoreComparator());
        Collections.sort(children, c);
        return children;
    }

    public class NiceScoreComparator implements Comparator<Child> {

        /**
         * metoda care ordoneaza lista de copii dupa scorul mediu al fiecarui copil (average score)
         * @param a
         * @param b
         * @return
         */
        public int compare(final Child a, final Child b) {
            double ascore = a.averageScore();
            double bscore = b.averageScore();
            if (ascore > bscore) {
                return 1;
            } else if (ascore < bscore) {
                return -1;
            }
            return b.getId() - a.getId();
        }
    }
}

