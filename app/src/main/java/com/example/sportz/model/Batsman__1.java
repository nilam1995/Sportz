
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Batsman__1 {

    @SerializedName("Batsman")
    @Expose
    private String batsman;
    @SerializedName("Runs")
    @Expose
    private String runs;
    @SerializedName("Balls")
    @Expose
    private String balls;

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getBalls() {
        return balls;
    }

    public void setBalls(String balls) {
        this.balls = balls;
    }

}
