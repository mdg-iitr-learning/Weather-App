package com.mdg.weather.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("name")
    String name;
    @SerializedName("weather")
    List<Weather> weather;
    @SerializedName("main")
    Main main;

    @SerializedName("wind")
    Wind wind;

    public Wind getWind() {
        return wind;
    }

    public String getName() {
        return name;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }
}