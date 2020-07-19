package com.designPatterns;

import java.io.Serializable;

public class SingeltonClass implements Serializable {

    private static volatile SingeltonClass instance;

    private SingeltonClass() {

    }

    public static SingeltonClass getInstance() {
        if (instance == null) {
            synchronized (SingeltonClass.class) {
                if (instance == null) {
                    instance = new SingeltonClass();
                }
            }
        }
        return instance;
    }
/* For serialization and deserialization*/
    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone(){
        return new CloneNotSupportedException();
    }
}

/*
* Singelton pattern is used when we need only one instance per application for ex- logger, dateUtil etc
* Synchronized keyword is used for multithreading scenario to make class thread safe
* double check of instance is required because synchronization is costly operation as it acquires lock to that code block
* constructor is private so that no class can make instance of this class
 */

