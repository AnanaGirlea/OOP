package main;

import checker.Checker;
import common.Constants;
import data.Child;
import data.Input;
import data.Gift;
import data.Budget;
import data.Output;
import data.OutputChild;
import enums.CityStrategyEnum;
import tools.BudgetAllocator;
import tools.BudgetAllocatorFactory;
import tools.DataUtil;
import tools.ChangesUtil;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Class used to run the code
 */
public final class Main {

    private Main() {
        ///constructor for checkstyle
    }

    /**
     * This method is used to call the checker which calculates the score
     * @param args the arguments used to call the main method
     */
    public static void main(final String[] args) throws IOException {

        BudgetAllocatorFactory factory  = new BudgetAllocatorFactory();

        ArrayList<List> allYearList = new ArrayList<>();

        DataUtil loader = DataUtil.getInstance();


        //pentru fiecare test al problemei
       for (int nr = 1; nr <= Constants.TESTS_NUMBER; nr++) {
       // int nr = 20;

        allYearList = new ArrayList<>();

        Input input = loader.loadData("tests/test" + nr + ".json");  // to be fixed

        List<List> annualList = new ArrayList<>();

        Budget buget = new Budget(input.getSantaBudget());
        buget.computeBudgetUnit(input.getInitialData().getChildren());


        List<Child> listChildren = ChangesUtil.removeAdults(input.getInitialData().getChildren());
        List<Gift> santaGiftsList = input.getInitialData().getSantaGiftsList();

        BudgetAllocator budgetAllocator =  factory.getBudgetAllocator(Constants.ALLOC_CHEAPEST);

        budgetAllocator.computeGiftList(buget.getBudgetUnit(), CityStrategyEnum.ID,
                listChildren, santaGiftsList);

        //ChangesUtil.computeBudgetAndScore(buget.getBudgetUnit(),listChildren);

        //creez rezultatul pentru iteratia initiala
        List<OutputChild> output = covertToOutputChild(listChildren);
        annualList.add(output);
        allYearList.add(annualList);

        for (int j = 1; j <= input.getNumberOfYears(); j++) {
            annualList = new ArrayList<>();

            // Calculeaza annual changes
            buget = ChangesUtil.applyAnnualChanges(listChildren, santaGiftsList,
                    input.getAnnualChanges().get(j - 1));
            input.getInitialData().setStrategy(input.getAnnualChanges().get(j - 1).getStrategy());
            //
            budgetAllocator.computeGiftList(buget.getBudgetUnit(),
                    input.getInitialData().getStrategy(), listChildren, santaGiftsList);
            output = covertToOutputChild(listChildren);

            //creez rezultatul pentru iteratia curenta
            annualList.add(output);
            allYearList.add(annualList);
        }

        Output save = new Output();
        save.setAnnualChildren(allYearList);

        String outName = "output/out_" + nr + ".json";
        loader.saveData(outName, save);

       }
        Checker.calculateScore();
    }

    /**
     * metoda pentru transformarea listelor de copii in format tip OutputChild
     * @param listChildren
     * @return
     */
    private static List<OutputChild> covertToOutputChild(final List<Child> listChildren) {
        List<OutputChild> result = new ArrayList<>();

        for (int i = 0; i < listChildren.size(); i++) {
            Child child = listChildren.get(i);
            result.add(new OutputChild(child));
        }
        return result;
    }


}
