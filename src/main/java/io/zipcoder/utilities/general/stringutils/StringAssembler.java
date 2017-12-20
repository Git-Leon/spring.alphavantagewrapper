package io.zipcoder.utilities.general.stringutils;

/**
 * Created by leon on 12/1/17.
 */
public class StringAssembler {
    private final StringBuilder sb;

    public StringAssembler() {
        this("");
    }

    public StringAssembler(String s) {
        this(new StringBuilder(s));
    }

    public StringAssembler(StringBuilder sb) {
        this.sb = sb;
    }

    public StringAssembler append(Object s, String... args) {
        sb.append(String.format(s.toString(), args));
        return this;
    }

    public StringAssembler nonNullAppend(Object s) {
        return conditionalAppend(s != null, s);
    }

    public StringAssembler conditionalAppend(boolean condition, Object s) {
        return condition ? append(s) : this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
