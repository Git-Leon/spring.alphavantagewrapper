package io.zipcoder.domain.temporalresolution;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.utilities.JSONString;
import org.springframework.stereotype.Component;

@Component
public abstract class TemporalResolution implements JSONString {

    @JsonProperty("1. open")
    private String open;

    @JsonProperty("2. high")
    private String high;

    @JsonProperty("3. low")
    private String low;

    @JsonProperty("4. close")
    private String close;

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "open: " + open +
                ",high: " + high +
                ",low: " + low +
                ",close: " + close;
    }
}