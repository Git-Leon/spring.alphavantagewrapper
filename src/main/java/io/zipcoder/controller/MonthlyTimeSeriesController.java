package io.zipcoder.controller;

import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.utilities.endpoint.MonthlyEndPointFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/19/17.
 */
@RestController
@RequestMapping(value = "/monthly")
public class MonthlyTimeSeriesController extends TimeSeriesController<MonthlyStockResponse,MonthlyEndPointFactory> {
    public MonthlyTimeSeriesController() {
        super(new MonthlyEndPointFactory(), MonthlyStockResponse.class);
    }


}
