package com.DataUSA.Data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;
import java.util.List;

public class DataResponse {

    @JsonProperty("data")
    private List<DataDetail> data;
}
