package io.zipcoder.domain.temporalresolution;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MonthlyTemporalResolution extends TemporalResolution {
    @JsonProperty("5. volume")
    private String volume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String toString() {
        return super.toString() + ",volume: " + volume;
    }
}
