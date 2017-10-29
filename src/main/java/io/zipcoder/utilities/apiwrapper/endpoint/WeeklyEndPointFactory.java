package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;

/**
 * Created by leon on 9/15/17.
 */
public final class WeeklyEndPointFactory extends TemporalEndPointFactory<WeeklyStockResponse> {
    public WeeklyEndPointFactory(String apiKey) {
        super(apiKey, ParamFunction.WEEKLY);
    }
}