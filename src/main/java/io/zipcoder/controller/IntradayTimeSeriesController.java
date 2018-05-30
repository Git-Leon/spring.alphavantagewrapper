package io.zipcoder.controller;

import io.zipcoder.domain.responses.IntradayStockResponse;
import io.zipcoder.utilities.endpoint.IntradayEndPointFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/19/17.
 */
@RestController
@RequestMapping(value = "/intraday")
public class IntradayTimeSeriesController extends TimeSeriesController<IntradayStockResponse,IntradayEndPointFactory> {
    public IntradayTimeSeriesController() {
        super(new IntradayEndPointFactory(), IntradayStockResponse.class);
    }
}