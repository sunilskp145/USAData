package com.DataUSA.Data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SourceData {

    @JsonProperty("annotations")
    private SourceDetail detail;
}
