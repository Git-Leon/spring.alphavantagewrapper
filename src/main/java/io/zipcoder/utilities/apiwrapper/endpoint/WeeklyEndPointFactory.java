package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

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