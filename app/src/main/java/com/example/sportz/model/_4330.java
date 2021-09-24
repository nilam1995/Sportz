
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class _4330 {

    @SerializedName("Position")
    @Expose
    private String position;
    @SerializedName("Name_Full")
    @Expose
    private String nameFull;
    @SerializedName("Iscaptain")
    @Expose
    private Boolean iscaptain;
    @SerializedName("Batting")
    @Expose
    private Batting__13 batting;
    @SerializedName("Bowling")
    @Expose
    private Bowling__13 bowling;

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

    public Boolean getIscaptain() {
        return iscaptain;
    }

    public void setIscaptain(Boolean iscaptain) {
        this.iscaptain = iscaptain;
    }

    public Batting__13 getBatting() {
        return batting;
    }

    public void setBatting(Batting__13 batting) {
        this.batting = batting;
    }

    public Bowling__13 getBowling() {
        return bowling;
    }

    public void setBowling(Bowling__13 bowling) {
        this.bowling = bowling;
    }

}
