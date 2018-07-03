package com.github.git_leon.controller;

import com.github.git_leon.domain.responses.WeeklyStockResponse;
import com.github.git_leon.utilities.endpoint.WeeklyEndPointFactory;
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
