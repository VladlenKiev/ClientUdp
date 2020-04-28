package com.xeon.udp.model;


/**
 * Created by Владимир on 28.04.2020.
 */

public class DataRequest {

    private String userId;
    private String data;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
