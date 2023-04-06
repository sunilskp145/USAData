package com.DataUSA.Data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataDetail {
    @JsonProperty("ID Nation")
    private String idNation;
    @JsonProperty("Nation")
    private String nation;
    @JsonProperty("ID Year")
    private String idYear;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Population")
    private String Population;
    @JsonProperty("Slug Nation")
    private String slugNation;

    public String getIdNation() {
        return idNation;
    }

    public void setIdNation(String idNation) {
        this.idNation = idNation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdYear() {
        return idYear;
    }

    public void setIdYear(String idYear) {
        this.idYear = idYear;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPopulation() {
        return Population;
    }

    public void setPopulation(String population) {
        Population = population;
    }

    public String getSlugNation() {
        return slugNation;
    }

    public void setSlugNation(String slugNation) {
        this.slugNation = slugNation;
    }
}
