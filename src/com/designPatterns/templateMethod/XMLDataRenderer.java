package com.designPatterns.templateMethod;

public class XMLDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "XML Read Data";
    }

    @Override
    public String processData(String data) {
        return "XML processed data";
    }
}
