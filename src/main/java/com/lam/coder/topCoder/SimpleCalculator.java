package com.lam.coder.topCoder;

/**
 * @author TopCoder Solution by L.Azuaje.
 *
 * Problem: SimpleCalculator.
 *  Single Round Match 178 Round 1 - Division II, Level One
 */
public class SimpleCalculator {

    public int calculate(String input)     {
        String[] data = input.split("\\*|\\+|-|\\/");

        char operator = ' ';
        if ( input.contains("*")  ) {
            operator = '*';
        } else if ( input.contains("/")  ) {
            operator = '/';
        } else if ( input.contains("+")  ) {
            operator = '+';
        } else if ( input.contains("-")  ) {
            operator = '-';
        }

        int result = 0;

        switch (operator) {
            case '*':
                result = Integer.parseInt(data[0]) * Integer.parseInt(data[1]);
                break;
            case '/':
                result = Integer.parseInt(data[0]) / Integer.parseInt(data[1]);
                break;
            case '+':
                result = Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
                break;
            case '-':
                result = Integer.parseInt(data[0]) - Integer.parseInt(data[1]);
                break;
            default:
        }

        return result;
    }
}
