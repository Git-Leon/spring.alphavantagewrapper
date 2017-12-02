package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.StockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

/**
 * Created by leon on 9/15/17.
 */
public abstract class TemporalEndPointFactory<StockResponseType extends StockResponse> {
    protected final EndPointFactory<StockResponseType> factory;
    private final ParamFunction paramFunction;

    public TemporalEndPointFactory(ParamFunction paramFunction) {
        this(APIKey.DEMO, paramFunction);
    }

    public TemporalEndPointFactory(String apiKey, ParamFunction paramFunction) {
        this(APIKey.valueOf(apiKey), paramFunction);
    }

    TemporalEndPointFactory(APIKey apiKey, ParamFunction paramFunction) {
        this.factory = new EndPointFactory(apiKey);
        this.paramFunction = paramFunction;
    }

    protected EndPoint<StockResponseType> get(ParamInterval interval, ParamSymbol symbol, ParamOutputSize outputSize) {
        return factory.get(paramFunction, interval, symbol, outputSize);
    }

    public EndPoint<StockResponseType> getFullOutput(ParamInterval interval, ParamSymbol symbol) {
        return get(interval, symbol, ParamOutputSize.FULL);
    }

    public EndPoint<StockResponseType> getCompactOuput(ParamInterval interval, ParamSymbol symbol) {
        return get(interval, symbol, ParamOutputSize.COMPACT);
    }

    public EndPoint<StockResponseType> getFullOutput(String interval, String symbol) {
        return getFullOutput(
                ParamInterval.valueOf(interval),
                ParamSymbol.valueOf(symbol));
    }

    public EndPoint<StockResponseType> getCompactOutput(String interval, String symbol) {
        return getCompactOuput(
                ParamInterval.valueOf(interval),
                ParamSymbol.valueOf(symbol));
    }
}
