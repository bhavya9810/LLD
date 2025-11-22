package com.creational.singleton;

public class Singleton_synchronizedBlock {

    private static Singleton_synchronizedBlock singleton;

    private Singleton_synchronizedBlock(){}

    public static Singleton_synchronizedBlock getObject(){

        if(singleton==null){

            synchronized (Singleton_synchronizedBlock.class){
                if(singleton==null){
                    singleton=new Singleton_synchronizedBlock();
                }

            }
        }
        return singleton;
    }

}
