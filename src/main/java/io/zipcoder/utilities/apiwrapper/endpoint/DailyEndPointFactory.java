package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;

/**
 * Created by leon on 9/15/17.
 */
public class DailyEndPointFactory extends  TemporalEndPointFactory<DailyStockResponse> {
    public DailyEndPointFactory(String apiKey) {
        super(apiKey, ParamFunction.DAILY);
    }
}
