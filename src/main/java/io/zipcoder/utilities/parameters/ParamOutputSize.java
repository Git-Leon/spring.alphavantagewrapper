package io.zipcoder.utilities.parameters;

/**
 * Created by leon on 9/14/17.
 */
public enum ParamOutputSize {
    COMPACT,
    FULL;

    public String toString() {
        // API representation
        return "&outputsize="+this.name().toLowerCase();
    }
}