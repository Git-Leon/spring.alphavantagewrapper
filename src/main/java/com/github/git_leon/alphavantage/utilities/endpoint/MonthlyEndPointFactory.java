package com.github.git_leon.alphavantage.utilities.endpoint;

import com.github.git_leon.alphavantage.utilities.parameters.ParamFunction;
import com.github.git_leon.alphavantage.domain.responses.MonthlyStockResponse;
import com.github.git_leon.alphavantage.utilities.APIKey;

/**
 * Created by leon on 9/15/17.
 */
public final class MonthlyEndPointFactory extends TemporalEndPointFactory<MonthlyStockResponse> {
    public MonthlyEndPointFactory(APIKey apiKey) {
        super(apiKey, ParamFunction.MONTHLY);
    }

    public MonthlyEndPointFactory() {
        super(ParamFunction.MONTHLY);
    }
}
