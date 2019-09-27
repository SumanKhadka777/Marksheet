package com.marksheet.result;



public class Result {

    private double android, IPC, API;

    public Result(double android, double IPC, double API) {

        this.android = android;
        this.IPC = IPC;
        this.API = API;
    }

    public double percentage() {
        return (android + IPC + API) / 300*100;
    }


    public double getAndroid() {
        return android;
    }

    public void setAndroid(double android) {
        this.android = android;
    }

    public double getIPC() {
        return IPC;
    }

    public void setIPC(double IPC) {
        this.IPC = IPC;
    }

    public double getAPI() {
        return API;
    }

    public void setAPI(double API) {
        this.API = API;
    }
}