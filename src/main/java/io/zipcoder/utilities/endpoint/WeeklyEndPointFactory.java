package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.APIKey;
import io.zipcoder.utilities.DemoAPIKey;
import io.zipcoder.utilities.parameters.ParamFunction;

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