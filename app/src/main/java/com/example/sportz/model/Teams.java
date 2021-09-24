
package com.example.sportz.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Teams {

    @SerializedName("4")
    @Expose
    private com.example.sportz.model._4 _4;
    @SerializedName("5")
    @Expose
    private com.example.sportz.model._5 _5;

    public com.example.sportz.model._4 get4() {
        return _4;
    }

    public void set4(com.example.sportz.model._4 _4) {
        this._4 = _4;
    }

    public com.example.sportz.model._5 get5() {
        return _5;
    }

    public void set5(com.example.sportz.model._5 _5) {
        this._5 = _5;
    }

}
