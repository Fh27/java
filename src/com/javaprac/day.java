package com.javaprac;

public enum day {

    Monday(true),
    tuesday(true),
    friday(true),
    sat(false),
    sun(false);
    private final boolean isday;
    day(boolean isday){
        this.isday=isday;
    }
    public String gettype(){
       return isday ? "Week":"end";
    }
}
