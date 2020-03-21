package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Oleg Kirsanov (albion.els@gmail.com).
 */

public class Calculator {

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        /**
         * Contains the value of the math operation.
         */
        int one = 1;

        /**
         * Contains the value of the math operation.
         */
        int two = 2;

        /**
         * Contains the result of the math operation Addition.
         */
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        /**
         * Contains the value of the math operation.
         */
        int six = 6;

        /**
         * Contains the value of the math operation.
         */
        int four = 4;

        /**
         * Contains the value of the math operation.
         */
        int five = 5;

        /**
         * Contains the result of the math operation Division.
         */
        int sixDivTwo = six / two;

        /**
         * Contains the result of the math operation Deprecation.
         */
        int fiveMinusTwo = five - two;

        /**
         * Contains the result of the math operation Multiplication.
         */
        int fourTimeTwo = four * two;
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}