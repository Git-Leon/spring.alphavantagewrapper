package com.github.git_leon.utilities.endpoint;

import com.github.git_leon.domain.responses.DailyStockResponse;
import com.github.git_leon.utilities.APIKeys;
import com.github.git_leon.utilities.parameters.ParamInterval;
import com.github.git_leon.utilities.parameters.ParamSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/1/17.
 */
public class DailyEndPointFactoryTest {
    DailyEndPointFactory factory = new DailyEndPointFactory(APIKeys.DEMO);

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