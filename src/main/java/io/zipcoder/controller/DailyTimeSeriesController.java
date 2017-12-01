package io.zipcoder.controller;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.domain.responses.IntradayStockResponse;
import io.zipcoder.utilities.apiwrapper.endpoint.DailyEndPointFactory;
import io.zipcoder.utilities.apiwrapper.endpoint.IntradayEndPointFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 9/14/17.
 */
@RestController
@RequestMapping(value = "/daily")
public class DailyTimeSeriesController  extends TimeSeriesController<DailyStockResponse,DailyEndPointFactory> {
    public DailyTimeSeriesController() {
        super(new DailyEndPointFactory(), DailyStockResponse.class);
    }
}