package com.demo.spring.entity;

public class Statistics {

    private int eventCount;
    private int averageDuration;
    private double hourUtilization;

    public Statistics() {
    }

    public int getEventCount() {
        return eventCount;
    }

    public void setEventCount(int eventCount) {
        this.eventCount = eventCount;
    }

    public int getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(int averageDuration) {
        this.averageDuration = averageDuration;
    }

    public double getHourUtilization() {
        return hourUtilization;
    }

    public void setHourUtilization(double hourUtilization) {
        this.hourUtilization = hourUtilization;
    }
}
