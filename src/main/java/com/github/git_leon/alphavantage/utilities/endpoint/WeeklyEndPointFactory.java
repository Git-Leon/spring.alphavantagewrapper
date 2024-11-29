package com.github.git_leon.alphavantage.utilities.endpoint;

import com.github.git_leon.alphavantage.domain.responses.WeeklyStockResponse;
import com.github.git_leon.alphavantage.utilities.APIKey;
import com.github.git_leon.alphavantage.utilities.parameters.ParamFunction;

/**
 * Created by leon on 9/15/17.
 */
public final class WeeklyEndPointFactory extends TemporalEndPointFactory<WeeklyStockResponse> {
    public WeeklyEndPointFactory(APIKey apiKey) {
        super(apiKey, ParamFunction.WEEKLY);
    }

    public WeeklyEndPointFactory() {
        super(ParamFunction.WEEKLY);
    }
}