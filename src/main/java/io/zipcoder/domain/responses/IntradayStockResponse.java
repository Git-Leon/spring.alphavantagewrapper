package io.zipcoder.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.domain.temporalresolution.IntraDailyTemporalResolution;

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

    @JsonProperty("Time Series (Intraday)")
    private HashMap<Date, IntraDailyTemporalResolution> temporalResolutionData;

    public HashMap<Date, IntraDailyTemporalResolution> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    public void setTemporalResolutionData(HashMap<Date, IntraDailyTemporalResolution> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }
}
