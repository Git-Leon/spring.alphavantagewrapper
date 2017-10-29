package io.zipcoder.utilities.apiwrapper.parameters;

/**
 * Created by leon on 9/14/17.
 */
public enum ParamOutputSize {
    COMPACT,
    FULL;

    public String toString() {
        // API representation
        return this.name().toLowerCase();
    }
}