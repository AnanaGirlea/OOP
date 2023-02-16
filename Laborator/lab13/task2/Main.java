package lab13.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: Initialize the calculator - DONE
        Calculator calculator = new Operations();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions - DONE

        // pentru add
        try {
            System.out.println(calculator.add(null, 7d));
        } catch (Calculator.NullParameterException e) {
            e.printStackTrace();
            System.out.println("Null_Parameter_Found");
        }

        try {
            System.out.println(calculator.add(Double.POSITIVE_INFINITY, 7d));
        } catch (Calculator.OverflowException e) {
            e.printStackTrace();
            System.out.println("Over_Flow_Found");
        }

        try {
            System.out.println(calculator.add(Double.NEGATIVE_INFINITY, 7d));
        } catch (Calculator.UnderflowException e) {
            e.printStackTrace();
            System.out.println("Under_Flow_Found");
        }

        // pentru divide
        try {
            System.out.println(calculator.divide(null, 7d));
        } catch (Calculator.NullParameterException e) {
            e.printStackTrace();
            System.out.println("Null_Parameter_Found");
        }

        try {
            System.out.println(calculator.divide(7d, 0d));
        } catch (Calculator.OverflowException e) {
            e.printStackTrace();
            System.out.println("Over_Flow_Found");
        }

        try {
            System.out.println(calculator.divide(Double.NEGATIVE_INFINITY, 7d));
        } catch (Calculator.UnderflowException e) {
            e.printStackTrace();
            System.out.println("Under_Flow_Found");
        }

        //pentru average
        try {
            System.out.println(calculator.divide(null, 7d));
        } catch (Calculator.NullParameterException e) {
            e.printStackTrace();
            System.out.println("Null_Parameter_Found");
        }
    }
}
