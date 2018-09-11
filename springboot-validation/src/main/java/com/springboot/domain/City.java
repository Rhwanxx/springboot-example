package com.springboot.domain;

import java.io.Serializable;

public class City implements Serializable {

    private static final long serialVersionUID = -8759623705759904029L;

    private Integer cityId;

    private String cityName;

    private String cityMemo;

    private Integer cityLevel;

    private String cityComment;

    public City(Integer cityId, String cityName, String cityMemo, Integer cityLevel, String cityComment) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityMemo = cityMemo;
        this.cityLevel = cityLevel;
        this.cityComment = cityComment;
    }

    public City() {
        super();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityMemo() {
        return cityMemo;
    }

    public void setCityMemo(String cityMemo) {
        this.cityMemo = cityMemo == null ? null : cityMemo.trim();
    }

    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
    }

    public String getCityComment() {
        return cityComment;
    }

    public void setCityComment(String cityComment) {
        this.cityComment = cityComment == null ? null : cityComment.trim();
    }
}