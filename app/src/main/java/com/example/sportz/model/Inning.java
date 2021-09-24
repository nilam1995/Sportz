
package com.example.sportz.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Inning {

    @SerializedName("Number")
    @Expose
    private String number;
    @SerializedName("Battingteam")
    @Expose
    private String battingteam;
    @SerializedName("Total")
    @Expose
    private String total;
    @SerializedName("Wickets")
    @Expose
    private String wickets;
    @SerializedName("Overs")
    @Expose
    private String overs;
    @SerializedName("Runrate")
    @Expose
    private String runrate;
    @SerializedName("Byes")
    @Expose
    private String byes;
    @SerializedName("Legbyes")
    @Expose
    private String legbyes;
    @SerializedName("Wides")
    @Expose
    private String wides;
    @SerializedName("Noballs")
    @Expose
    private String noballs;
    @SerializedName("Penalty")
    @Expose
    private String penalty;
    @SerializedName("AllottedOvers")
    @Expose
    private String allottedOvers;
    @SerializedName("Batsmen")
    @Expose
    private List<Batsman> batsmen = null;
    @SerializedName("Partnership_Current")
    @Expose
    private PartnershipCurrent partnershipCurrent;
    @SerializedName("Bowlers")
    @Expose
    private List<Bowler> bowlers = null;
    @SerializedName("FallofWickets")
    @Expose
    private List<FallofWicket> fallofWickets = null;
    @SerializedName("PowerPlay")
    @Expose
    private PowerPlay powerPlay;
    @SerializedName("Target")
    @Expose
    private String target;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBattingteam() {
        return battingteam;
    }

    public void setBattingteam(String battingteam) {
        this.battingteam = battingteam;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String getRunrate() {
        return runrate;
    }

    public void setRunrate(String runrate) {
        this.runrate = runrate;
    }

    public String getByes() {
        return byes;
    }

    public void setByes(String byes) {
        this.byes = byes;
    }

    public String getLegbyes() {
        return legbyes;
    }

    public void setLegbyes(String legbyes) {
        this.legbyes = legbyes;
    }

    public String getWides() {
        return wides;
    }

    public void setWides(String wides) {
        this.wides = wides;
    }

    public String getNoballs() {
        return noballs;
    }

    public void setNoballs(String noballs) {
        this.noballs = noballs;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getAllottedOvers() {
        return allottedOvers;
    }

    public void setAllottedOvers(String allottedOvers) {
        this.allottedOvers = allottedOvers;
    }

    public List<Batsman> getBatsmen() {
        return batsmen;
    }

    public void setBatsmen(List<Batsman> batsmen) {
        this.batsmen = batsmen;
    }

    public PartnershipCurrent getPartnershipCurrent() {
        return partnershipCurrent;
    }

    public void setPartnershipCurrent(PartnershipCurrent partnershipCurrent) {
        this.partnershipCurrent = partnershipCurrent;
    }

    public List<Bowler> getBowlers() {
        return bowlers;
    }

    public void setBowlers(List<Bowler> bowlers) {
        this.bowlers = bowlers;
    }

    public List<FallofWicket> getFallofWickets() {
        return fallofWickets;
    }

    public void setFallofWickets(List<FallofWicket> fallofWickets) {
        this.fallofWickets = fallofWickets;
    }

    public PowerPlay getPowerPlay() {
        return powerPlay;
    }

    public void setPowerPlay(PowerPlay powerPlay) {
        this.powerPlay = powerPlay;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
