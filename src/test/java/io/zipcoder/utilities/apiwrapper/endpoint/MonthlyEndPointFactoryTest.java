package io.zipcoder.utilities.apiwrapper.endpoint;

import io.zipcoder.domain.responses.MonthlyStockResponse;
import io.zipcoder.utilities.apiwrapper.APIKey;
import io.zipcoder.utilities.apiwrapper.parameters.ParamSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/2/17.
 */
public class MonthlyEndPointFactoryTest {
    MonthlyEndPointFactory factory = new MonthlyEndPointFactory(APIKey.DEMO);

    @Test
    public void testMSFT() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_MONTHLY&symbol=MSFT&apikey=demo";
        EndPoint<MonthlyStockResponse> endPoint = factory.get(ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCall() {
        EndPoint<MonthlyStockResponse> endPoint = factory.get(ParamSymbol.MSFT);
        MonthlyStockResponse monthlyStockResponse = endPoint.call(MonthlyStockResponse.class);
        Assert.assertNotNull(monthlyStockResponse);
    }
}
