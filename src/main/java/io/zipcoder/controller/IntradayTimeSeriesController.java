package io.zipcoder.controller;

import io.zipcoder.domain.responses.IntradayStockResponse;
import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.endpoint.IntradayEndPointFactory;
import io.zipcoder.utilities.apiwrapper.endpoint.MonthlyEndPointFactory;
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