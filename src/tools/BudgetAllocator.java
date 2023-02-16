package tools;

import data.Child;
import data.Gift;
import enums.CityStrategyEnum;

import java.util.List;

public interface BudgetAllocator {

        /**
         * metoda care asigneaza cadourile copiilor in functie de list de preferine a fiecarui copil
         * @param budgetUnit
         * @param strategy
         * @param children
         * @param giftList
         */
        void computeGiftList(double budgetUnit, CityStrategyEnum strategy,
                             List<Child> children, List<Gift> giftList);
}
