package tools;

import data.Child;
import data.CityScore;
import enums.Cities;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

public class NiceCityScoreStrategy implements AnnualStrategy {

    /**
     * metoda implementata din interfata AnnualStrategy
     * metoda aplica strategia in functie de scorul mediu al fiecarui oras (nice score city)
     * @param children
     * @return
     */
    @Override
    public List<Child> execute(final List<Child> children) {
        Collections.sort(children, new IdComparator());

        //calculam media niceScore per city sa obtinem NiceCityScore
        Map<Cities, CityScore> cities = new HashMap<>();
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            Cities cityName = child.getCity();

            if (cities.get(cityName) == null) {
                CityScore avg = new CityScore(cityName, child.averageScore());
                cities.put(cityName, avg);
            } else {
                CityScore avg = cities.get(cityName);
                avg.addScore(child.averageScore());
            }
        }

        Comparator c = Collections.reverseOrder(new NiceCityScoreComparator(cities));
        children.sort(c);

        return children;
    }

    public class NiceCityScoreComparator implements Comparator<Child> {
        private Map<Cities, CityScore> cities = null;

        public NiceCityScoreComparator(final Map<Cities, CityScore> cities) {
            this.cities = cities;
        }

        /**
         * metoda care ordoneaza lista de copii dupa scorul mediu al fiecarui oras (nice score city)
         * @param a
         * @param b
         * @return
         */
        public int compare(final Child a, final Child b) {

            //dupa id daca e acelasi oras
            if (a.getCity() == b.getCity()) {
                return b.getId() - a.getId();
            }

            if (cities.get(a.getCity()).getAverage() == cities.get(b.getCity()).getAverage()) {
                return b.getCity().toString().compareTo(a.getCity().toString());
            }
            //compar scorul
           if (cities.get(a.getCity()).getAverage() > cities.get(b.getCity()).getAverage()) {
               return 1;
           } else {
               return -1;
           }
        }
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
