package io.zipcoder.utilities.apiwrapper.parameters;

/**
 * Created by leon on 9/14/17.
 */
public enum ParamInterval {
    ONE(1),
    FIVE(5),
    FIFTEEN(15),
    THIRTY(30),
    SIXTY(60);

    private final int minuteInterval;

    ParamInterval(int minuteInterval) {
        this.minuteInterval = minuteInterval;
    }

    @Override
    public String toString() {
        // API representation
        return minuteInterval + "min";
    }
}