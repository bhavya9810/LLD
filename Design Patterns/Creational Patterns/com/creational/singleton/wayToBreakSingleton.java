package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class wayToBreakSingleton {

    public static void main(String[] args) throws Exception {

        /*
        1st way to break Singleton (Reflection API)
        using reflection api at runtime we create a new instance of the constructor

        solution - 1. if object is there -> throw exception from inside constructor
                   2. use enum
         */

        Singleton s1 = Singleton.getObject();
        System.out.println(s1.hashCode());

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s2 = constructor.newInstance();
        System.out.println(s2.hashCode());

        //using enum
        Singleton_usingEnum s3 = Singleton_usingEnum.INSTANCE;
        System.out.println(s3.hashCode());

        Singleton_usingEnum s4 = Singleton_usingEnum.INSTANCE;
        System.out.println(s4.hashCode());



        /* 2nd way to break Singleton (DeSerialization)

            ObjectOutputStream - converting an object into stream of bytes
            ObjectInputStream- Reconstructing the object back from bytes


            Solution -implementing readResolve method
        */

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Test.ser"));
        oos.writeObject(s1);

        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Test.ser"));
        Singleton s = (Singleton) ois.readObject();
        System.out.println(s.hashCode());



        /* 3nd way to break Singleton (Cloning)

         */

        Singleton s5 = Singleton.getObject();
        System.out.println(s5.hashCode());

        Singleton s6 = (Singleton) s5.clone();
        System.out.println(s6.hashCode());



    }


}
