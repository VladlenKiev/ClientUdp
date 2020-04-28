package com.xeon.udp.model;

public class DataResponse {

    public int code;
    public String message;


    public DataResponse(String successStatus, int code) {
        this.message = successStatus;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
