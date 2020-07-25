package com.designPatterns.templateMethod;

public class CSVDataRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "CSV Data read";
    }

    @Override
    public String processData(String data) {
        return " CSV Processed data";
    }
}
