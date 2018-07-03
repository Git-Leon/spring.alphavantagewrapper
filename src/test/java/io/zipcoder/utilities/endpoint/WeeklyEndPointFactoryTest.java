package io.zipcoder.utilities.endpoint;

import io.zipcoder.domain.responses.WeeklyStockResponse;
import io.zipcoder.utilities.DemoAPIKey;
import io.zipcoder.utilities.parameters.ParamSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/1/17.
 */
public class WeeklyEndPointFactoryTest {
    WeeklyEndPointFactory factory = new WeeklyEndPointFactory(DemoAPIKey.DEMO);

    @Test
    public void testMSFT() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=MSFT&apikey=demo";
        EndPoint<WeeklyStockResponse> endPoint = factory.get(ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }
}
