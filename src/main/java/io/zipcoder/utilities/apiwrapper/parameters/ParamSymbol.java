package io.zipcoder.utilities.apiwrapper.parameters;

/**
 * Created by leon on 9/14/17.
 */
public enum ParamSymbol {
    MSFT;

    @Override
    public String toString() {
        // API representation
        return this.name();
    }
}