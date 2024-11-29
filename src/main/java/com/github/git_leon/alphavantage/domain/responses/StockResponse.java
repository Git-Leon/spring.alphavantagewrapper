package com.github.git_leon.alphavantage.domain.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.git_leon.alphavantage.domain.temporalresolution.TemporalResolution;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.sql.Date;
import java.util.Map;


@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StockResponse<T extends TemporalResolution> implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    @JsonProperty("Meta Data")
    private MetaData metaData;

    // TODO - Find solution for dynamic annotation
    protected Map<Date, T> temporalResolutionData;

    // TODO - Remove method declaration, insert method definition whence dynamic annotation solution discovered
    abstract public Map<Date, T> getTemporalResolutionData();

    // TODO - Remove method declaration, insert method definition whence dynamic annotation solution discovered
    abstract public void setTemporalResolutionData(Map<Date, T> temporalResolutionData);

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

