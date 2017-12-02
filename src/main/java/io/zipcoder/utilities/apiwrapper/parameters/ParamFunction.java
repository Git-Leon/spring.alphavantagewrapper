package io.zipcoder.utilities.apiwrapper.parameters;

/**
 * Created by leon on 9/14/17.
 */
public enum ParamFunction {
    INTRADAY,
    DAILY,
    WEEKLY,
    MONTHLY;

    @Override
    public String toString() {
        // API representation
        return "function=TIME_SERIES_" + this.name();
    }
}