
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class _63751 {

    @SerializedName("Position")
    @Expose
    private String position;
    @SerializedName("Name_Full")
    @Expose
    private String nameFull;
    @SerializedName("Batting")
    @Expose
    private Batting__6 batting;
    @SerializedName("Bowling")
    @Expose
    private Bowling__6 bowling;

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

    public Batting__6 getBatting() {
        return batting;
    }

    public void setBatting(Batting__6 batting) {
        this.batting = batting;
    }

    public Bowling__6 getBowling() {
        return bowling;
    }

    public void setBowling(Bowling__6 bowling) {
        this.bowling = bowling;
    }

}
