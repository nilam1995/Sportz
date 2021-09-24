package com.example.sportz.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Generated("jsonschema2pojo")
public class _5 {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @SerializedName("Name_Full")
    @Expose
    private String nameFull;
    @SerializedName("Name_Short")
    @Expose
    private String nameShort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @SerializedName("Players")
    @Expose
    private Players__1 players;

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public Players__1 getPlayers() {
        return players;
    }

    public void setPlayers(Players__1 players) {
        this.players = players;
    }

}
