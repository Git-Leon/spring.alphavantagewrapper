package com.github.git_leon.domain.temporalresolution;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by leon on 9/14/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeeklyTemporalResolution extends TemporalResolution {

    @JsonProperty("5. volume")
    private String volume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String toJsonString() {
        return "{" + toString() +  "}";
    }

    public String toString() {
        return super.toString() + "volume: " + volume;
    }
}
