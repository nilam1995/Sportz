
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class _10167 {

    @SerializedName("Position")
    @Expose
    private String position;
    @SerializedName("Name_Full")
    @Expose
    private String nameFull;
    @SerializedName("Iskeeper")
    @Expose
    private Boolean iskeeper;
    @SerializedName("Batting")
    @Expose
    private Batting__15 batting;
    @SerializedName("Bowling")
    @Expose
    private Bowling__15 bowling;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public Boolean getIskeeper() {
        return iskeeper;
    }

    public void setIskeeper(Boolean iskeeper) {
        this.iskeeper = iskeeper;
    }

    public Batting__15 getBatting() {
        return batting;
    }

    public void setBatting(Batting__15 batting) {
        this.batting = batting;
    }

    public Bowling__15 getBowling() {
        return bowling;
    }

    public void setBowling(Bowling__15 bowling) {
        this.bowling = bowling;
    }

}
