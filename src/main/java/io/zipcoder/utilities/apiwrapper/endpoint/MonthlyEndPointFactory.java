package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;

/**
 * Created by leon on 9/15/17.
 */
public final class MonthlyEndPointFactory extends TemporalEndPointFactory<MonthlyStockResponse> {
    public MonthlyEndPointFactory(String apiKey) {
        super(apiKey, ParamFunction.MONTHLY);
    }
}
