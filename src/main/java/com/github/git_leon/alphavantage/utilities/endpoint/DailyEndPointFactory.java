package com.github.git_leon.alphavantage.utilities.endpoint;

import com.github.git_leon.alphavantage.utilities.parameters.ParamFunction;
import com.github.git_leon.alphavantage.domain.responses.DailyStockResponse;
import com.github.git_leon.alphavantage.utilities.APIKey;

/**
 * Created by leon on 9/15/17.
 */
public class DailyEndPointFactory extends TemporalEndPointFactory<DailyStockResponse> {
    public DailyEndPointFactory(APIKey apiKey) {
        super(apiKey, ParamFunction.DAILY);
    }

    public DailyEndPointFactory() {
        super(ParamFunction.DAILY);
    }
}
