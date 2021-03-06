package com.javarush.task.task34.task3412;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);


    private int value1;
    private String value2;
    private Date value3;

    public Solution(int value1, String value2, Date value3) {
        logger.debug ("Add value of construct value1, value2, value3",value1,value2,value3);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static void main(String[] args) {
        Solution s = new Solution(2,"hello",new Date());
        s.setValue1(1);
        s.setValue2("Hello, java");
        s.setValue3(new Date());
        s.calculateAndSetValue3(5);
        s.printDateAsLong();
        s.printString();
        s.divide(1,0);
    }

    public void calculateAndSetValue3(long value) {
        logger.trace ("Calculation");
        logger.info ("Calculation");
        logger.debug ("Calculation");
        value -= 133;
        if (value > Integer.MAX_VALUE) {
            logger.debug ("value1 ",(value / Integer.MAX_VALUE));
            value1 = (int) (value / Integer.MAX_VALUE);
        } else {
            logger.debug ("value1  ", value);
            value1 = (int) value;
        }
    }

    public void printString() {
        logger.trace ("call printString");

        if (value2 != null) {
            System.out.println(value2.length());
        }
    }

    public void printDateAsLong() {
        logger.trace ("call printDateAsLong");
        if (value3 != null) {
            System.out.println(value3.getTime());
        }
    }

    public void divide(int number1, int number2) {
        logger.trace ("Call function divide");
        try {
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            logger.error ("Unknoow errors",e);
        }
    }

    public void setValue1(int value1) {
        logger.debug ("Construct value1",value1);
        this.value1 = value1;
    }

    public void setValue2(String value2) {
        logger.debug ("Construct value2",value2);
        this.value2 = value2;
    }

    public void setValue3(Date value3) {
        logger.debug ("Construct value3",value3);
        this.value3 = value3;
    }
}