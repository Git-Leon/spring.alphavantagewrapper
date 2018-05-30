package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.utilities.APIKey;
import io.zipcoder.utilities.parameters.ParamFunction;

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
