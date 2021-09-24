
package com.example.sportz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Bowler {

    @SerializedName("Bowler")
    @Expose
    private String bowler;
    @SerializedName("Overs")
    @Expose
    private String overs;
    @SerializedName("Maidens")
    @Expose
    private String maidens;
    @SerializedName("Runs")
    @Expose
    private String runs;
    @SerializedName("Wickets")
    @Expose
    private String wickets;
    @SerializedName("Economyrate")
    @Expose
    private String economyrate;
    @SerializedName("Noballs")
    @Expose
    private String noballs;
    @SerializedName("Wides")
    @Expose
    private String wides;
    @SerializedName("Dots")
    @Expose
    private String dots;
    @SerializedName("Isbowlingtandem")
    @Expose
    private Boolean isbowlingtandem;
    @SerializedName("Isbowlingnow")
    @Expose
    private Boolean isbowlingnow;
    @SerializedName("ThisOver")
    @Expose
    private List<ThisOver> thisOver = null;

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String getMaidens() {
        return maidens;
    }

    public void setMaidens(String maidens) {
        this.maidens = maidens;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getEconomyrate() {
        return economyrate;
    }

    public void setEconomyrate(String economyrate) {
        this.economyrate = economyrate;
    }

    public String getNoballs() {
        return noballs;
    }

    public void setNoballs(String noballs) {
        this.noballs = noballs;
    }

    public String getWides() {
        return wides;
    }

    public void setWides(String wides) {
        this.wides = wides;
    }

    public String getDots() {
        return dots;
    }

    public void setDots(String dots) {
        this.dots = dots;
    }

    public Boolean getIsbowlingtandem() {
        return isbowlingtandem;
    }

    public void setIsbowlingtandem(Boolean isbowlingtandem) {
        this.isbowlingtandem = isbowlingtandem;
    }

    public Boolean getIsbowlingnow() {
        return isbowlingnow;
    }

    public void setIsbowlingnow(Boolean isbowlingnow) {
        this.isbowlingnow = isbowlingnow;
    }

    public List<ThisOver> getThisOver() {
        return thisOver;
    }

    public void setThisOver(List<ThisOver> thisOver) {
        this.thisOver = thisOver;
    }

}
