package io.zipcoder.microlabs.mastering_loops;

import org.apache.maven.shared.utils.StringUtils;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String string = "";
        for (int i = 1; i <= 4; i++) {
            string = string + StringUtils.repeat("*", i) + "\n";
        }
        return string;
    }


    public static String getRow(int numberOfStars) {
        String string = "";
        for (int i = 1; i < numberOfStars; i++) {
            string += "*";
        }
        return string;
    }

    public static String getSmallTriangle() {
        String string = "";
        for (int i = 1; i < 5; i++) {
            string = string + StringUtils.repeat("*", i) + "\n";
        }
        return string;
    }

    public static String getLargeTriangle() {
        String string = "";
        for (int i = 1; i <= 9; i++) {
            string = string + StringUtils.repeat("*", i) + "\n";
        }
        return string;
    }
}