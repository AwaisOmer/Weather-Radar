package com.weather.forecast;

import java.util.ArrayList;

public class List {


private Double dt;

private Main main;

private java.util.List<Weather> weather = new ArrayList<Weather>();

private Clouds clouds;

private Wind wind;

private Sys sys;

private String dtTxt;


public Double getDt() {
return dt;
}


public void setDt(Double dt) {
this.dt = dt;
}


public Main getMain() {
return main;
}


public void setMain(Main main) {
this.main = main;
}


public java.util.List<Weather> getWeather() {
return weather;
}


public void setWeather(java.util.List<Weather> weather) {
this.weather = weather;
}


public Clouds getClouds() {
return clouds;
}


public void setClouds(Clouds clouds) {
this.clouds = clouds;
}


public Wind getWind() {
return wind;
}


public void setWind(Wind wind) {
this.wind = wind;
}


public Sys getSys() {
return sys;
}


public void setSys(Sys sys) {
this.sys = sys;
}


public String getDtTxt() {
return dtTxt;
}


public void setDtTxt(String dtTxt) {
this.dtTxt = dtTxt;
}

}