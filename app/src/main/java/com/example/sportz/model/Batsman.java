
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Batsman {

    @SerializedName("Batsman")
    @Expose
    private String batsman;
    @SerializedName("Runs")
    @Expose
    private String runs;
    @SerializedName("Balls")
    @Expose
    private String balls;
    @SerializedName("Fours")
    @Expose
    private String fours;
    @SerializedName("Sixes")
    @Expose
    private String sixes;
    @SerializedName("Dots")
    @Expose
    private String dots;
    @SerializedName("Strikerate")
    @Expose
    private String strikerate;
    @SerializedName("Dismissal")
    @Expose
    private String dismissal;
    @SerializedName("Howout")
    @Expose
    private String howout;
    @SerializedName("Bowler")
    @Expose
    private String bowler;
    @SerializedName("Fielder")
    @Expose
    private String fielder;
    @SerializedName("Isonstrike")
    @Expose
    private Boolean isonstrike;

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

    public String getFours() {
        return fours;
    }

    public void setFours(String fours) {
        this.fours = fours;
    }

    public String getSixes() {
        return sixes;
    }

    public void setSixes(String sixes) {
        this.sixes = sixes;
    }

    public String getDots() {
        return dots;
    }

    public void setDots(String dots) {
        this.dots = dots;
    }

    public String getStrikerate() {
        return strikerate;
    }

    public void setStrikerate(String strikerate) {
        this.strikerate = strikerate;
    }

    public String getDismissal() {
        return dismissal;
    }

    public void setDismissal(String dismissal) {
        this.dismissal = dismissal;
    }

    public String getHowout() {
        return howout;
    }

    public void setHowout(String howout) {
        this.howout = howout;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getFielder() {
        return fielder;
    }

    public void setFielder(String fielder) {
        this.fielder = fielder;
    }

    public Boolean getIsonstrike() {
        return isonstrike;
    }

    public void setIsonstrike(Boolean isonstrike) {
        this.isonstrike = isonstrike;
    }

}
