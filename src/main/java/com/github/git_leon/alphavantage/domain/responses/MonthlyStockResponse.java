package com.github.git_leon.alphavantage.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.alphavantage.domain.temporalresolution.MonthlyTemporalResolution;

import javax.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class MonthlyStockResponse extends StockResponse<MonthlyTemporalResolution> {
    public MonthlyStockResponse() {
        super.temporalResolutionData = new HashMap<>();
    }

    // TODO - Abstract this to the StockResponse
    @JsonProperty("Time Series (Monthly)")
    private HashMap<Date, MonthlyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public HashMap<Date, MonthlyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(HashMap<Date, MonthlyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
