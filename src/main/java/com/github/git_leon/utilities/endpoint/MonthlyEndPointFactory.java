package com.github.git_leon.utilities.endpoint;

import com.github.git_leon.utilities.parameters.ParamFunction;
import com.github.git_leon.domain.responses.MonthlyStockResponse;
import com.github.git_leon.utilities.APIKey;

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
