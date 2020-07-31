package com.github.git_leon.utilities.endpoint;

import com.github.git_leon.domain.responses.IntradayStockResponse;
import com.github.git_leon.utilities.APIKey;
import com.github.git_leon.utilities.parameters.ParamInterval;
import com.github.git_leon.utilities.parameters.ParamSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/1/17.
 */
public class IntradayEndPointFactoryTest {
    IntradayEndPointFactory factory = new IntradayEndPointFactory(APIKey.DEMO);

    @Test
    public void test() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=15min&outputsize=full&apikey=demo";
        EndPoint<IntradayStockResponse> endPoint = factory.getFullOutput(ParamInterval.FIFTEEN, ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testCall() {
        String expected = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=15min&outputsize=full&apikey=demo";
        EndPoint<IntradayStockResponse> endPoint = factory.getFullOutput(ParamInterval.FIFTEEN, ParamSymbol.MSFT);
        String actual = endPoint.toString();
        Assert.assertEquals(expected, actual);
    }
}
