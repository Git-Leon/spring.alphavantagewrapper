package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamFunction;
import io.zipcoder.utilities.apiwrapper.parameters.ParamInterval;
import io.zipcoder.utilities.apiwrapper.parameters.ParamOutputSize;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;

/**
 * Created by leon on 9/15/17.
 */
public class DailyEndPointFactory extends TemporalEndPointFactory<DailyStockResponse> {
    public DailyEndPointFactory() {
        super(ParamFunction.DAILY);
    }
}
