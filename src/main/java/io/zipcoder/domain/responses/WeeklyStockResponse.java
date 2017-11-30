package io.zipcoder.domain.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.domain.temporalresolution.WeeklyTemporalResolution;

import javax.persistence.Entity;
import java.sql.Date;
import java.util.HashMap;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class WeeklyStockResponse extends StockResponse<WeeklyTemporalResolution> {
    @JsonProperty("Time Series (Weekly)")
    private HashMap<Date, WeeklyTemporalResolution> temporalResolutionData;
}
