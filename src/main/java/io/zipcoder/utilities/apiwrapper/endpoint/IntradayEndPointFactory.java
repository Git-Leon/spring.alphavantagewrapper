package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.IntradayStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

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
        return factory.get(ParamFunction.INTRADAY, interval, symbol, outputSize);
    }
}
