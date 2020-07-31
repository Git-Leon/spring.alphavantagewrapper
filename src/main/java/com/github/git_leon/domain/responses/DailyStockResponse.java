package com.github.git_leon.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.domain.temporalresolution.DailyTemporalResolution;

import javax.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;

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
    private HashMap<Date, DailyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public HashMap<Date, DailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(HashMap<Date, DailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}