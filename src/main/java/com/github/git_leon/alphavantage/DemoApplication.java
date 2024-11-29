package com.github.git_leon.alphavantage;

import com.github.git_leon.alphavantage.domain.responses.DailyStockResponse;
import com.github.git_leon.alphavantage.domain.responses.MetaData;
import com.github.git_leon.alphavantage.domain.temporalresolution.DailyTemporalResolution;
import com.github.git_leon.alphavantage.utilities.APIKey;
import com.github.git_leon.alphavantage.utilities.endpoint.DailyEndPointFactory;
import com.github.git_leon.alphavantage.utilities.endpoint.EndPoint;
import com.github.git_leon.alphavantage.utilities.parameters.ParamInterval;
import com.github.git_leon.alphavantage.utilities.parameters.ParamSymbol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;

import java.sql.Date;
import java.util.Map;

@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @EventListener
    public void onShutdown(ContextClosedEvent event) {
        System.out.println("Application context is shutting down.");
    }
    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        // You can use this framework to hit the endpoint below
        // https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=MSFT&apikey=demo
        // using the following routine...
        DailyEndPointFactory factory = new DailyEndPointFactory(APIKey.DEMO);
        EndPoint<DailyStockResponse> endPoint = factory.getFullOutput(ParamInterval.FIFTEEN, ParamSymbol.MSFT);
        DailyStockResponse response = endPoint.call(DailyStockResponse.class);
        MetaData metaData = response.getMetaData();
        Map<Date, DailyTemporalResolution> timeSeries = response.getTemporalResolutionData();

        // retrieve results this way
        System.out.println("---------------------");
        System.out.println(new StringBuilder()
                .append(metaData.toString())
                .append("\n{Information = " + metaData.getInformation())
                .append("\nLast Refreshed = " + metaData.getLastRefreshed())
                .append("\nSymbol = " + metaData.getSymbol())
                .append("\nTime Zone = " + metaData.getTimeZone() + "}")
                .toString());

        System.out.println("\n---------------------");
        for (Map.Entry<Date, DailyTemporalResolution> timeSeriesEntry : timeSeries.entrySet()) {
            DailyTemporalResolution dailyTemporalResolution = timeSeriesEntry.getValue();
            System.out.println("\n---------------------");
            System.out.println(new StringBuilder()
                    .append("\n{Date = " + timeSeriesEntry.getKey())
                    .append("\nVolume = " + dailyTemporalResolution.getVolume())
                    .append("\nHigh = " + dailyTemporalResolution.getHigh())
                    .append("\nLow = " + dailyTemporalResolution.getLow())
                    .append("\nClose = " + dailyTemporalResolution.getClose())
                    .append("\nOpen = " + dailyTemporalResolution.getOpen() + "}")
                    .toString());
        }
    }
}