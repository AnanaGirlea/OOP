package tools;

import common.Constants;
import data.Child;
import data.Budget;
import data.Gift;
import data.AnnualChanges;
import enums.Category;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class ChangesUtil {

    /**
     * metoda care actualizeaza baza de date in functie de schimbarile de la an la an
     * @param children
     * @param santaGiftsList
     * @param changes
     * @return
     */
    public static Budget applyAnnualChanges(final List<Child> children, final List<Gift>
            santaGiftsList, final AnnualChanges changes) {
        incrementAge(children);
        children.addAll(changes.getNewChildren());
        santaGiftsList.addAll(changes.getNewGifts());


        // fac un map pentru access rapid la schimbari
        Map<Integer, Child> childrenChanges = new HashMap();

        for (int i = 0; i < changes.getChildrenUpdates().size(); i++) {
            Child update = changes.getChildrenUpdates().get(i);
            childrenChanges.put(update.getId(), update);
        }

        //pentru fiecare copil ma uit sa vad daca am schimbari
        for (int i = 0; i < children.size(); i++) {

            Child child = children.get(i);
            child.getGifts().clear();

            // am gasit o schimabre
            if (childrenChanges.get(child.getId()) != null) {

                Child update = childrenChanges.get(child.getId());
                //salveaza nou niceScore

                child.setNiceScore(update.getNiceScore());
                child.setElf(update.getElf());


                if (update.getGiftsPreferences() != null && update.getGiftsPreferences().size()
                        > 0) {
                    //salvez preferintele ca un map pentru access raoid
                    Map<Category, Category> preferences = new HashMap<>();
                    for (int j = 0; j < child.getGiftsPreferences().size(); j++) {
                        Category category = child.getGiftsPreferences().get(j);
                        preferences.put(category, category);
                    }
                    //preferinte de adaugat
                    List<Category> toAdd = new ArrayList<>();
                    //pentru fiecare update
                    for (int j = 0; j < update.getGiftsPreferences().size(); j++) {

                        Category category = update.getGiftsPreferences().get(j);

                        if (preferences.get(category) == null) {
                            toAdd.add(category);
                            preferences.put(category, category);
                            //child.getGiftsPreferences().add(0,category);
                        } else {
                            child.getGiftsPreferences().remove(category);
                            if (!toAdd.contains(category)) {
                                toAdd.add(category);
                            }
                        }
                    }
                    child.getGiftsPreferences().addAll(0, toAdd);
                }
            }

        }

        removeAdults(children);

        Budget buget = new Budget(changes.getNewSantaBudget());
        buget.computeBudgetUnit(children);
        computeBudgetAndScore(buget.getBudgetUnit(), children);

        return buget;
    }

    /**
     * metoda care imbatraneste copii cu un an
     * @param children
     */
    private static void incrementAge(final List<Child> children) {
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);
            child.incrementAge(1);
        }
    }

    /**
     * metoda care calculeaza bugetul
     * @param bugetUnit
     * @param children
     */
    public static void computeBudgetAndScore(final double bugetUnit, final List<Child> children) {
        //citim lista de copii si stergem pe cei mai mari de 18 ani.
        Iterator<Child> iterator = children.iterator();
        while (iterator.hasNext()) {
            Child child = iterator.next();
            child.score();
            child.computeBudget(bugetUnit);
        }
    }

    /**
     * metoda care elimina copii deveniti adulti
     * @param children
     * @return
     */
    public static List<Child> removeAdults(final List<Child> children) {
        //citim lista de copii si stergem pe cei mai mari de 18 ani.
        Iterator<Child> iterator = children.iterator();
        while (iterator.hasNext()) {
            Child child = iterator.next();
            if (child.getAge() > Constants.TEEN) {
                iterator.remove();
            }
        }
        return children;
    }
}
