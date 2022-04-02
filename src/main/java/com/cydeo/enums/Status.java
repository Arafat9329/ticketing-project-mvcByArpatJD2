package com.cydeo.enums;

public enum Status {
    OPEN("Open"),IN_PENDING("In Progress"),COMPLETE("Completed");

    private final String value;

    private Status (String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
