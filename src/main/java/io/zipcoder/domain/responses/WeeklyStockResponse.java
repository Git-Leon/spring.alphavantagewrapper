package io.zipcoder.domain.responses;

import io.zipcoder.domain.temporalresolution.WeeklyTemporalResolution;

import javax.persistence.Entity;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class WeeklyStockResponse extends StockResponse<WeeklyTemporalResolution> {
}
