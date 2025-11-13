package com.creational.prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String impData;

    public void loadImportantData(){
        this.impData="vry important data";

    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return this;
    }


}
