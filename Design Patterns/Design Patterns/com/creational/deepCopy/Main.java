package com.creational.deepCopy;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating object using shallow copy");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("10.192.192.100");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);


        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
