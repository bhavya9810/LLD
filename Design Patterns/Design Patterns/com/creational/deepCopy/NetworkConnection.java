package com.creational.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String impData;
    private List<String> domains=new ArrayList<>();



    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadImportantData() throws InterruptedException {

        this.impData = "very very important Data";

        domains.add("www.FAANGCracker.com");
        domains.add("www.ProductCracker.com");
        domains.add("www.HighPackageCracker.com");


        Thread.sleep(5000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp(this.ip);
        networkConnection.setImpData(this.impData);

        for(String s:domains){
            networkConnection.getDomains().add(s);
        }
        return networkConnection;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                ", domains=" + domains +
                '}';
    }
}
