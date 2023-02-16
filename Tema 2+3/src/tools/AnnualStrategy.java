package tools;

import data.Child;

import java.util.List;

public interface AnnualStrategy {
    /**
     * metoda care aplica strategia in anul respectiv
     * @param children
     * @return
     */
    List<Child> execute(List<Child> children);
}
