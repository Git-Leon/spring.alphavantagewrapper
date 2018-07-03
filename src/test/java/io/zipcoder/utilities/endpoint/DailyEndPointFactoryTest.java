package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.DailyStockResponse;
import io.zipcoder.utilities.DemoAPIKey;
import io.zipcoder.utilities.parameters.ParamInterval;
import io.zipcoder.utilities.parameters.ParamSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/1/17.
 */
public class DailyEndPointFactoryTest {
    DailyEndPointFactory factory = new DailyEndPointFactory(DemoAPIKey.DEMO);

    @Test
    public void testMSFT() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=MSFT&apikey=demo";
        EndPoint<DailyStockResponse> endPoint = factory.get(ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCall() {
        EndPoint<DailyStockResponse> endPoint = factory.getFullOutput(ParamInterval.FIFTEEN, ParamSymbol.MSFT);
        DailyStockResponse dailyStockResponse = endPoint.call(DailyStockResponse.class);
        Assert.assertNotNull(dailyStockResponse);
    }
}