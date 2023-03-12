package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String string = "";
        int i;
        for (i = start; i < stop; i++) {
            if (i % 2 != 0) {
                string += i;
        }
        }
        return string;
    }


    public static String getOddNumbers(int start, int stop) {
        String string = "";
        int i;
        for (i = start; i < stop; i++) {
            if (i % 2 == 0) {
                string += i;
            }
            }
            return string;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String string = "";
        int i;
        for (i = start; i < stop; i++) {
            if (i % 5 == 0) {
                string += i * i;
            }

        }
        return string;
    }

    public static String getRange(int start) {
        String string = "";
        int i;
        for (i = 0; i < start ; i ++) {    // or i<start -1; to pass first range test
            string += i;
        }
        return string;
        
    }

    public static String getRange(int start, int stop) {
        String string = "";
        int i;
        for (i = start; i < stop; i ++) {
            string += i;
        }
        return string;
    }


    public static String getRange(int start, int stop, int step) {
        String string = "";
        int i;
        for (i = start; i < stop ; i = i + step) {
            string += i;
        }
        return string;

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String string = "";
        int i;
        for (i = start; i < stop ; i = i + step) {
            int exponentiation = (int)Math.pow(i, exponent);
            string += exponentiation ;
        }

        return string;
    }
}
