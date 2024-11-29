package com.github.git_leon.alphavantage.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.alphavantage.domain.temporalresolution.IntraDailyTemporalResolution;

import jakarta.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class IntradayStockResponse extends StockResponse<IntraDailyTemporalResolution> {
    public IntradayStockResponse() {
        super.temporalResolutionData = new HashMap<>();
    }

    // TODO - Abstract this to the StockResponse
    @JsonProperty("Time Series (Intraday)")
    private Map<Date, IntraDailyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public Map<Date, IntraDailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(Map<Date, IntraDailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
