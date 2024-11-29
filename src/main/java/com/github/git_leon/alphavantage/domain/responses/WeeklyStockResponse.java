package com.github.git_leon.alphavantage.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.alphavantage.domain.temporalresolution.WeeklyTemporalResolution;

import jakarta.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class WeeklyStockResponse extends StockResponse<WeeklyTemporalResolution> {
    public WeeklyStockResponse() {
        super.temporalResolutionData = new HashMap<>();
    }

    // TODO - Abstract this to the StockResponse
    @JsonProperty("Time Series (Weekly)")
    private Map<Date, WeeklyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public Map<Date, WeeklyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(Map<Date, WeeklyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
