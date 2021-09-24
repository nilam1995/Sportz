
package com.example.sportz.model;

import androidx.room.Entity;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DataResponse {

    @SerializedName("Matchdetail")
    @Expose
    private Matchdetail matchdetail;
    @SerializedName("Nuggets")
    @Expose
    private List<String> nuggets = null;
    @SerializedName("Innings")
    @Expose
    private List<Inning> innings = null;
    @SerializedName("Teams")
    @Expose
    private Teams teams;
    @SerializedName("Notes")
    @Expose
    private Notes notes;

    public Matchdetail getMatchdetail() {
        return matchdetail;
    }

    public void setMatchdetail(Matchdetail matchdetail) {
        this.matchdetail = matchdetail;
    }

    public List<String> getNuggets() {
        return nuggets;
    }

    public void setNuggets(List<String> nuggets) {
        this.nuggets = nuggets;
    }

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

}
