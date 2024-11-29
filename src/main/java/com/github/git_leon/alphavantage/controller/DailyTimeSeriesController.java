package com.github.git_leon.alphavantage.controller;

import com.github.git_leon.alphavantage.domain.responses.DailyStockResponse;
import com.github.git_leon.alphavantage.utilities.endpoint.DailyEndPointFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/14/17.
 */
@RestController
@RequestMapping(value = "/daily")
public class DailyTimeSeriesController extends TimeSeriesController<DailyStockResponse, DailyEndPointFactory> {
    public DailyTimeSeriesController() {
        super(new DailyEndPointFactory(), DailyStockResponse.class);
    }
}