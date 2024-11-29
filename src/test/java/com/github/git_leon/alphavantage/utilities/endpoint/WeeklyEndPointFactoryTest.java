package com.github.git_leon.alphavantage.utilities.endpoint;

import com.github.git_leon.alphavantage.domain.responses.WeeklyStockResponse;
import com.github.git_leon.alphavantage.utilities.parameters.ParamSymbol;
import com.github.git_leon.alphavantage.utilities.APIKey;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/1/17.
 */
public class WeeklyEndPointFactoryTest {
    WeeklyEndPointFactory factory = new WeeklyEndPointFactory(APIKey.DEMO);

    @Test
    public void testMSFT() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=MSFT&apikey=demo";
        EndPoint<WeeklyStockResponse> endPoint = factory.get(ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }
}
