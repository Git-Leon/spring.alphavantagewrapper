package com.github.git_leon.alphavantage.utilities.endpoint;

import com.github.git_leon.alphavantage.utilities.parameters.ParamFunction;
import com.github.git_leon.alphavantage.utilities.parameters.ParamInterval;
import com.github.git_leon.alphavantage.utilities.parameters.ParamOutputSize;
import com.github.git_leon.alphavantage.utilities.parameters.ParamSymbol;
import com.github.git_leon.alphavantage.domain.responses.StockResponse;
import com.github.git_leon.alphavantage.utilities.APIKey;

/**
 * Created by leon on 9/15/17.
 */
public abstract class TemporalEndPointFactory<StockResponseType extends StockResponse> {
    protected final EndPointFactory<StockResponseType> factory;
    protected final ParamFunction paramFunction;

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

    // TODO - Fix this strange abstraction
    protected EndPoint<StockResponseType> get(ParamSymbol symbol) {
        return get(null, symbol, null);
    }

    // TODO - Fix this strange abstraction
    protected EndPoint<StockResponseType> get(ParamInterval interval, ParamSymbol symbol, ParamOutputSize outputSize) {
        return factory.get(paramFunction, null, symbol, null);
    }

    // This method is only applicable to Daily and Intraday >>> TODO - Fix this
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
