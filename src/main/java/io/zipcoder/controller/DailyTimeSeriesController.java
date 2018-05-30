package io.zipcoder.controller;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.utilities.endpoint.DailyEndPointFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/14/17.
 */
@RestController
@RequestMapping(value = "/daily")
public class DailyTimeSeriesController extends TimeSeriesController<DailyStockResponse,DailyEndPointFactory> {
    public DailyTimeSeriesController() {
        super(new DailyEndPointFactory(), DailyStockResponse.class);
    }
}