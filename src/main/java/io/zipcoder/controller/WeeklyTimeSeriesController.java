package io.zipcoder.controller;

import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.endpoint.WeeklyEndPointFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/19/17.
 */
@RestController
@RequestMapping(value = "/weekly")
public class WeeklyTimeSeriesController extends TimeSeriesController<WeeklyStockResponse,WeeklyEndPointFactory> {
    public WeeklyTimeSeriesController() {
        super(new WeeklyEndPointFactory(), WeeklyStockResponse.class);
    }
}
