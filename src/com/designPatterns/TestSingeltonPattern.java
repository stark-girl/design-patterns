package com.designPatterns;

import java.io.*;

public class TestSingeltonPattern {
    public static void main(String arg[]) throws Exception {
        SingeltonClass singeltonClass1= SingeltonClass.getInstance();
        SingeltonClass singeltonClass2= SingeltonClass.getInstance();

        if(singeltonClass1==singeltonClass2){
            System.out.println(singeltonClass1==singeltonClass2);
        }
        /* This Shows that both instances are same */

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("/Users/Dell/baby/singelton.ser")));
        objectOutputStream.writeObject(singeltonClass1);

        SingeltonClass singeltonClass3 = null;

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("/Users/Dell/baby/singelton.ser")));
        singeltonClass3= (SingeltonClass) objectInputStream.readObject();

        System.out.println( singeltonClass3 == singeltonClass1);

        objectOutputStream.close();
        objectInputStream.close();
    }
}
