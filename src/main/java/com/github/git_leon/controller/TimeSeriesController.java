package com.github.git_leon.controller;

import com.github.git_leon.domain.responses.StockResponse;
import com.github.git_leon.utilities.endpoint.EndPoint;
import com.github.git_leon.utilities.endpoint.TemporalEndPointFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.MappedSuperclass;
import java.util.function.BiFunction;

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


    @GetMapping(value = "/getFull")
    public ResponseEntity<StockResponseType> getFull(
            @PathVariable("interval") String interval,
            @PathVariable("symbol") String symbol) {

        return get(endpointFactory::getFullOutput, interval, symbol);
    }


    @GetMapping(value = "/getCompact")
    public ResponseEntity<StockResponseType> getCompact(
            @PathVariable("interval") String interval,
            @PathVariable("symbol") String symbol) {

        return get(endpointFactory::getCompactOutput, interval, symbol);
    }


    private ResponseEntity<StockResponseType> get(
            BiFunction<String, String, EndPoint<StockResponseType>> getMethod,
            String interval, String symbol) {

        MultiValueMap<String, String> headers = null;
        EndPoint<StockResponseType> endPoint = getMethod.apply(interval, symbol);
        StockResponseType stockResponse = endPoint.call(cls);
        return new ResponseEntity<>(stockResponse, headers, HttpStatus.OK);
    }


}
