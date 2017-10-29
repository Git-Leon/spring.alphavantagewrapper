package io.zipcoder.domain.responses;

import io.zipcoder.domain.temporalresolution.DailyTemporalResolution;

import javax.persistence.Entity;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class DailyStockResponse extends StockResponse<DailyTemporalResolution> {
}
