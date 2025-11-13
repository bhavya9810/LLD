package com.creational.prototype;

public class Main {

    public static void main(String[] args) {
        System.out.println("creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.165.11.123");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
