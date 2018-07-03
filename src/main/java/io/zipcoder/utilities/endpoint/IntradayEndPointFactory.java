package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.IntradayStockResponse;
import io.zipcoder.utilities.APIKey;
import io.zipcoder.utilities.DemoAPIKey;
import io.zipcoder.utilities.parameters.ParamFunction;
import io.zipcoder.utilities.parameters.ParamInterval;
import io.zipcoder.utilities.parameters.ParamOutputSize;
import io.zipcoder.utilities.parameters.ParamSymbol;

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
