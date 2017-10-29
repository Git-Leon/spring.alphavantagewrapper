package io.zipcoder.domain.responses;

import io.zipcoder.domain.temporalresolution.MonthlyTemporalResolution;

import javax.persistence.Entity;

/**
 * Created by leon on 9/15/17.
 */
@Entity
public class MonthlyStockResponse extends StockResponse<MonthlyTemporalResolution> {
}
