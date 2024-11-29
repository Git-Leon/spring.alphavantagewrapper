package com.github.git_leon.alphavantage.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.alphavantage.domain.temporalresolution.DailyTemporalResolution;

import jakarta.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class DailyStockResponse extends StockResponse<DailyTemporalResolution> {
    public DailyStockResponse() {
        super.temporalResolutionData = new HashMap<>();
    }

    // TODO - Abstract this to the StockResponse
    @JsonProperty("Time Series (Daily)")
    private Map<Date, DailyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public Map<Date, DailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(Map<Date, DailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}