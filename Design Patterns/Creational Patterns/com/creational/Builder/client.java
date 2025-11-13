package com.creational.Builder;

public class client {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserName("Bhavya Singh")
                .setUserId(007)
                .build();

        System.out.println(user);
    }
}
