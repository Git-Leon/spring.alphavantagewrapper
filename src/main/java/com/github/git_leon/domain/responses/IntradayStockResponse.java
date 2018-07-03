package com.github.git_leon.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.domain.temporalresolution.IntraDailyTemporalResolution;

import javax.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;

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
    private HashMap<Date, IntraDailyTemporalResolution> temporalResolutionData;

    // TODO - Abstract this to the StockResponse
    public HashMap<Date, IntraDailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    // TODO - Abstract this to the StockResponse
    public void setTemporalResolutionData(HashMap<Date, IntraDailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
