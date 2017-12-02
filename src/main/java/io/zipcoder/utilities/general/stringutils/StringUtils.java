package io.zipcoder.utilities.general.stringutils;

/**
 * Created by leon on 12/1/17.
 */
public class StringUtils {
    public static String substring(String input, String start, String end) {
        int startingIndex = input.indexOf(start) + 1;
        int endingIndex = input.indexOf(end);
        return input.substring(startingIndex, endingIndex);
    }
}
