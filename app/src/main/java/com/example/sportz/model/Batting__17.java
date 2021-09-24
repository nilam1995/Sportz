
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Batting__17 {

    @SerializedName("Style")
    @Expose
    private String style;
    @SerializedName("Average")
    @Expose
    private String average;
    @SerializedName("Strikerate")
    @Expose
    private String strikerate;
    @SerializedName("Runs")
    @Expose
    private String runs;

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

    public String getStrikerate() {
        return strikerate;
    }

    public void setStrikerate(String strikerate) {
        this.strikerate = strikerate;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

}
