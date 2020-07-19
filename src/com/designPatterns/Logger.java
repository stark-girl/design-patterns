package com.designPatterns;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {
    private static volatile Logger logger;

    private Logger() {
    }

    public static void getInstance () {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
    }

    public static void log(String message){
        System.out.println(message);
    }


    @Override
    protected Object clone(){
        return new CloneNotSupportedException();
    }
}
