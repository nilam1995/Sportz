
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Matchdetail {

    @SerializedName("Team_Home")
    @Expose
    private String teamHome;
    @SerializedName("Team_Away")
    @Expose
    private String teamAway;
    @SerializedName("Match")
    @Expose
    private Match match;
    @SerializedName("Series")
    @Expose
    private Series series;
    @SerializedName("Venue")
    @Expose
    private Venue venue;
    @SerializedName("Officials")
    @Expose
    private Officials officials;
    @SerializedName("Weather")
    @Expose
    private String weather;
    @SerializedName("Tosswonby")
    @Expose
    private String tosswonby;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Status_Id")
    @Expose
    private String statusId;
    @SerializedName("Player_Match")
    @Expose
    private String playerMatch;
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Winningteam")
    @Expose
    private String winningteam;
    @SerializedName("Winmargin")
    @Expose
    private String winmargin;
    @SerializedName("Equation")
    @Expose
    private String equation;

    public String getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    public String getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Officials getOfficials() {
        return officials;
    }

    public void setOfficials(Officials officials) {
        this.officials = officials;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTosswonby() {
        return tosswonby;
    }

    public void setTosswonby(String tosswonby) {
        this.tosswonby = tosswonby;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPlayerMatch() {
        return playerMatch;
    }

    public void setPlayerMatch(String playerMatch) {
        this.playerMatch = playerMatch;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getWinningteam() {
        return winningteam;
    }

    public void setWinningteam(String winningteam) {
        this.winningteam = winningteam;
    }

    public String getWinmargin() {
        return winmargin;
    }

    public void setWinmargin(String winmargin) {
        this.winmargin = winmargin;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

}
