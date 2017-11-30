package io.zipcoder.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.domain.temporalresolution.MonthlyTemporalResolution;

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

    @JsonProperty("Time Series (Monthly)")
    private HashMap<Date, MonthlyTemporalResolution> temporalResolutionData;

    public HashMap<Date, MonthlyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    public void setTemporalResolutionData(HashMap<Date, MonthlyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
