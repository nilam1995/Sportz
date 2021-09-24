
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Bowling__11 {

    @SerializedName("Style")
    @Expose
    private String style;
    @SerializedName("Average")
    @Expose
    private String average;
    @SerializedName("Economyrate")
    @Expose
    private String economyrate;
    @SerializedName("Wickets")
    @Expose
    private String wickets;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getEconomyrate() {
        return economyrate;
    }

    public void setEconomyrate(String economyrate) {
        this.economyrate = economyrate;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

}
