package com.mdg.weather.models;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    double temp;
    @SerializedName("pressure")
    double pressure;

    public double getTemp() {
        return temp;
    }

    public double getPressure() {
        return pressure;
    }
}
