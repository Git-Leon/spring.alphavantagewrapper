package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

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
