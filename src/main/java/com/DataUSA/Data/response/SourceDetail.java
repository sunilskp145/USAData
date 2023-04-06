package com.DataUSA.Data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceDetail {
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("source_description")
    private String sourceDescription;
    @JsonProperty("dataset_name")
    private String dataSetname;
    @JsonProperty("dataset_link")
    private String dataSetLink;
    @JsonProperty("table_id")
    private String dataSetId;
    private String topic;
    private String subtopic;


    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getDataSetname() {
        return dataSetname;
    }

    public void setDataSetname(String dataSetname) {
        this.dataSetname = dataSetname;
    }

    public String getDataSetLink() {
        return dataSetLink;
    }

    public void setDataSetLink(String dataSetLink) {
        this.dataSetLink = dataSetLink;
    }

    public String getDataSetId() {
        return dataSetId;
    }

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubtopic() {
        return subtopic;
    }

    public void setSubtopic(String subtopic) {
        this.subtopic = subtopic;
    }
}
