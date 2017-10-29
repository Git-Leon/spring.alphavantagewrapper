package io.zipcoder.domain.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.zipcoder.domain.temporalresolution.TemporalResolution;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;
import java.util.HashMap;


@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StockResponse<T extends TemporalResolution> implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @JsonProperty("Meta Data")
    private MetaData metaData;

    @JsonProperty("Time Series")
    private HashMap<Date, T> temporalResolutionData;

    public HashMap<Date, T> getTemporalResolutionData() {
        return temporalResolutionData;
    }

    public void setTemporalResolutionData(HashMap<Date, T> temporalResolutionData) {
        this.temporalResolutionData = temporalResolutionData;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        return "StockResponse{" +
                "metadata='" + metaData.getInformation()  + '\'' +
                ", time=" + temporalResolutionData.toString() +
                '}';
    }
}

