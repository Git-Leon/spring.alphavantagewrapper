package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.StockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;
import io.zipcoder.utilities.general.stringutils.StringAssembler;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leon on 9/14/17.
 */
public class EndPoint<StockResponseType extends StockResponse> {
    private final String apiCall;

    EndPoint(ParamFunction function, ParamInterval interval, ParamSymbol symbol, ParamOutputSize outputSize, String apiKey) {
        this.apiCall = new StringAssembler("https://www.alphavantage.co/query?")
                .nonNullAppend(function)
                .nonNullAppend(symbol)
                .nonNullAppend(interval)
                .nonNullAppend(outputSize)
                .append("&apikey=" + apiKey)
                .toString();
    }

    public StockResponseType call(Class<StockResponseType> cls) {
        return call(new RestTemplate(), cls);
    }

    public StockResponseType call(RestTemplate restTemplate, Class<StockResponseType> cls) {
        /** @param cls - Some class of parameterized type StockResponseType
         *  @param <StockResponseType> - Some sub-type of StockResponse
         *  @param restTemplate - the rest template to get respective object
         *  @return respective StockResponse object */
        return restTemplate.getForObject(apiCall, cls);
    }

    @Override
    public String toString() {
        return apiCall;
    }
}