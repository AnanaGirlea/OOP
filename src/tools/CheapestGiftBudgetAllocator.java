package tools;

import common.Constants;
import data.Child;
import data.Gift;
import enums.Category;
import enums.CityStrategyEnum;
import enums.ElvesType;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CheapestGiftBudgetAllocator implements BudgetAllocator {

    public CheapestGiftBudgetAllocator() {
    }

    /**
     * metoda pentru asignarea cadourilor copiilor in functie de list de preferine a fiecarui copil
     * @return
     */
    public void computeGiftList(final double budgetUnit, final CityStrategyEnum strategy,
                                final List<Child> children, final List<Gift> giftList) {
        double buget = 0.0d;

        //pentru fiecare copil
        for (int i = 0; i < children.size(); i++) {
            children.get(i).averageScore();
            children.get(i).computeBudget(budgetUnit);
        }
        //execute annual strategy
        if (CityStrategyEnum.NICE_SCORE == strategy) {
            AnnualContext context = new AnnualContext(new NiceScoreStrategy());
            context.executeStrategy(children);
        } else if (CityStrategyEnum.NICE_SCORE_CITY == strategy) {
            AnnualContext context = new AnnualContext(new NiceCityScoreStrategy());
            context.executeStrategy(children);
        } else {
            AnnualContext context = new AnnualContext(new IdOrderStrategy());
            context.executeStrategy(children);
        }
        //

        //pentru fiecare copil
        for (int i = 0; i < children.size(); i++) {
            Child child = children.get(i);

            children.get(i).averageScore();
            children.get(i).computeBudget(budgetUnit);

            buget = children.get(i).getBudget();


            //pentru fiecare preferinta a copilului
            for (int j = 0; j < child.getGiftsPreferences().size(); j++) {
                Gift gift = cheapestGift(giftList, child.getGiftsPreferences().get(j));
                if (gift != null && gift.getPrice() < buget) {
                    gift.decQuantity();
                    children.get(i).getGifts().add(new Gift(gift.getProductName(),
                            gift.getPrice(), gift.getCategory()));
                    buget = buget - gift.getPrice();
                }
            }

        }

        doYellowElfMagic(children, giftList);

        //trebuie sortati dupa id dupa ce am asignat cadouri
        IdOrderStrategy str = new IdOrderStrategy();
        IdOrderStrategy.IdComparator sorter = str.new IdComparator();
        Collections.sort(children, sorter);

    }

    /**
     * metoda care returneaza cel mai ieftin cadou in functie de categorie
     * @param giftList
     * @param category
     * @return
     */
    public Gift cheapestGift(final List<Gift> giftList, final Category category) {

        Gift found = findCheapestGift(category, giftList);

        if (found != null && Constants.MAXPRICE > found.getPrice()) {
            return found;
        }
        return null;
    }

    /**
     * metoda care calculeaza cel mai ieftin cadou in functie de categorie
     * @param category
     * @param giftList
     * @return
     */
    public Gift findCheapestGift(final Category category, final List<Gift> giftList) {
        Gift gift = null;
        double minPrice = Double.MAX_VALUE;

        for (int i = 0; i < giftList.size(); i++) {
            if (giftList.get(i).getCategory().toLowerCase().equalsIgnoreCase(category.toString())) {
                Gift found = giftList.get(i);

                if (gift == null && found.getQuantity() > 0) {
                    gift = found;
                    minPrice = found.getPrice();
                } else if ((minPrice > found.getPrice() && found.getQuantity() > 0)) {
                    gift = found;
                    minPrice = found.getPrice();
                }

            }
        }
        return gift;
    }

    /**
     * metoda care aplica regulile elfului galben
     * @param children
     * @param giftList
     */
    private void doYellowElfMagic(final List<Child> children, final List<Gift> giftList) {
        //calculez minimele pe categorii folosind un Map
        Map<String, Gift> minime = new HashMap<>();

        for (int i = 0; i < giftList.size(); i++) {
            Gift gift = giftList.get(i);
            if (minime.get(gift.getCategory()) == null) {
                //primul minim pe categoria aia
                minime.put(gift.getCategory(), gift);
            } else {
                Gift minim = minime.get(gift.getCategory());
                if (minim.getPrice() > gift.getPrice()) {
                    minime.put(gift.getCategory(), gift);
                }
            }
        }

        for (int i = 0; i < children.size(); i++) {

            Child child = children.get(i);
            if (child.getElf() == ElvesType.YELLOW && child.getGifts() == null
                    || child.getGifts().size() == 0) {
                    //luam preferintele
                    for (int j = 0; j < child.getGiftsPreferences().size(); j++) {
                        Category category = child.getGiftsPreferences().get(j);
                        Gift cheapest = minime.get(category);

                        if (cheapest != null && cheapest.getQuantity() > 0) {
                            ArrayList<Gift> giftBox = new ArrayList<>();
                            giftBox.add(new Gift(cheapest.getProductName(), cheapest.getPrice(),
                                    cheapest.getCategory()));
                            child.setGifts(giftBox);

                            cheapest.decQuantity();
                    }
                }
            }
        }
    }

}
