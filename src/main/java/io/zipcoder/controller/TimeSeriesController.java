package io.zipcoder.controller;

import io.zipcoder.domain.responses.StockResponse;
import io.zipcoder.utilities.apiwrapper.endpoint.EndPoint;
import io.zipcoder.utilities.apiwrapper.endpoint.TemporalEndPointFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.MappedSuperclass;

/**
 * Created by leon on 11/30/17.
 */
@MappedSuperclass
@RestController
@RequestMapping(value = "/timeseries")
abstract public class TimeSeriesController<
        StockResponseType extends StockResponse,
        TemporalEndPointFactoryType extends TemporalEndPointFactory<StockResponseType>> {

    private final TemporalEndPointFactoryType endpointFactory;
    private final Class<StockResponseType> cls;

    public TimeSeriesController(TemporalEndPointFactoryType endpointFactory, Class<StockResponseType> cls) {
        this.endpointFactory = endpointFactory;
        this.cls = cls;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<StockResponseType> getFull(
            @PathVariable("interval") String interval,
            @PathVariable("symbol") String symbol) {

        MultiValueMap<String, String> headers = null;
        EndPoint<StockResponseType> endpoint = endpointFactory.getFullOutput(interval, symbol);
        StockResponseType stockResponse = endpoint.call(cls);
        return new ResponseEntity<>(stockResponse, headers, HttpStatus.OK);
    }
}
