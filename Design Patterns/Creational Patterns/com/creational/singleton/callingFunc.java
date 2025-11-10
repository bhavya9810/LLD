package com.creational.singleton;

import java.lang.reflect.Constructor;

public class callingFunc {

    public static void main(String[] args) throws Exception {

        Singleton obj1 = Singleton.getObject();
        Singleton obj2 = Singleton.getObject();
        Singleton obj3 = Singleton.getObject();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        Singleton_EagerWay obj4= Singleton_EagerWay.getObject_EagerWay();
        Singleton_EagerWay obj5= Singleton_EagerWay.getObject_EagerWay();

        System.out.println(obj4.hashCode());
        System.out.println(obj4.hashCode());

        Singleton_synchronizedClass obj6= Singleton_synchronizedClass.getObject();
        Singleton_synchronizedClass obj7= Singleton_synchronizedClass.getObject();

        System.out.println(obj6.hashCode());
        System.out.println(obj7.hashCode());


    }


}
