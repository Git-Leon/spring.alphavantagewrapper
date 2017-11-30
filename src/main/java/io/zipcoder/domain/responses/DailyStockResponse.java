package io.zipcoder.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.domain.temporalresolution.DailyTemporalResolution;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class DailyStockResponse extends StockResponse<DailyTemporalResolution> {
    @JsonProperty("Time Series (Daily)")
    private HashMap<Date, DailyTemporalResolution> temporalResolutionData;

    public HashMap<Date, DailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    public void setTemporalResolutionData(HashMap<Date, DailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
