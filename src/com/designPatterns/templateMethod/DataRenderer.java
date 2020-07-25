package com.designPatterns.templateMethod;

public abstract class DataRenderer {
    public void renderer(){
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);

    }
    public abstract String readData();

    public abstract  String processData(String data);
}
