
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PowerPlay {

    @SerializedName("PP1")
    @Expose
    private String pp1;
    @SerializedName("PP2")
    @Expose
    private String pp2;

    public String getPp1() {
        return pp1;
    }

    public void setPp1(String pp1) {
        this.pp1 = pp1;
    }

    public String getPp2() {
        return pp2;
    }

    public void setPp2(String pp2) {
        this.pp2 = pp2;
    }

}
