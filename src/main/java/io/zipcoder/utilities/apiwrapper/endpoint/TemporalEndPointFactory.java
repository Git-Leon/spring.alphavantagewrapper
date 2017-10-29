package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.StockResponse;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

/**
 * Created by leon on 9/15/17.
 */
public abstract class TemporalEndPointFactory<T extends StockResponse> {
    protected final EndPointFactory<T> factory;
    private final ParamFunction paramFunction;

    public TemporalEndPointFactory(String apiKey, ParamFunction paramFunction) {
        this.factory = new EndPointFactory(apiKey);
        this.paramFunction = paramFunction;
    }

    private EndPoint<T> get(ParamInterval interval, ParamSymbol symbol, ParamOutputSize outputSize) {
        return factory.get(paramFunction, interval, symbol, outputSize);
    }

    public EndPoint<T> getFullOutput(ParamInterval interval, ParamSymbol symbol) {
        return get(interval, symbol, ParamOutputSize.FULL);
    }

    public EndPoint<T> getCompactOuput(ParamInterval interval, ParamSymbol symbol) {
        return get(interval, symbol, ParamOutputSize.COMPACT);
    }

}
