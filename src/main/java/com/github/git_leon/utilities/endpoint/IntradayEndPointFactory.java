package com.github.git_leon.utilities.endpoint;

import com.github.git_leon.utilities.parameters.ParamFunction;
import com.github.git_leon.utilities.parameters.ParamInterval;
import com.github.git_leon.utilities.parameters.ParamOutputSize;
import com.github.git_leon.utilities.parameters.ParamSymbol;
import com.github.git_leon.domain.responses.IntradayStockResponse;
import com.github.git_leon.utilities.APIKey;

/**
 * Created by leon on 9/15/17.
 */
public class IntradayEndPointFactory extends TemporalEndPointFactory<IntradayStockResponse> {
    public IntradayEndPointFactory(APIKey apiKey) {
        super(apiKey, ParamFunction.INTRADAY);
    }

    public IntradayEndPointFactory() {
        super(ParamFunction.INTRADAY);
    }

    @Override
    protected EndPoint<IntradayStockResponse> get(ParamInterval interval, ParamSymbol symbol, ParamOutputSize outputSize) {
        return factory.get(paramFunction, interval, symbol, outputSize);
    }
}
