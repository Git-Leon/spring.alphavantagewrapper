package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.utilities.APIKey;
import io.zipcoder.utilities.DemoAPIKey;
import io.zipcoder.utilities.parameters.ParamFunction;

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
