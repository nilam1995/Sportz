
package com.example.sportz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PartnershipCurrent {

    @SerializedName("Runs")
    @Expose
    private String runs;
    @SerializedName("Balls")
    @Expose
    private String balls;
    @SerializedName("Batsmen")
    @Expose
    private List<Batsman__1> batsmen = null;

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

    public List<Batsman__1> getBatsmen() {
        return batsmen;
    }

    public void setBatsmen(List<Batsman__1> batsmen) {
        this.batsmen = batsmen;
    }

}
