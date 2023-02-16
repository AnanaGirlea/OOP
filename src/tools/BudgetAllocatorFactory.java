package tools;

import common.Constants;

public class BudgetAllocatorFactory {

    /**
     * metoda pentru alocarea bugetului
     * @param type
     * @return
     */
    public BudgetAllocator getBudgetAllocator(final String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase(Constants.ALLOC_CHEAPEST)) {
            return new CheapestGiftBudgetAllocator();
        }
        return null;
    }
}
