package com.jrodmanu.ch8ex1;

public class Clock {
    private int hr, min, sec;
    public Clock() {
        setTime(0, 0, 0);
    }
    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }
    public void setTime(int hours, int minutes, int seconds) {
        if(0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
        if(0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;
        if(0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }
    public int getHours() {
        return hr;
    }
    public int getMinutes() {
        return min;
    }
    public int getSeconds() {
        return sec;
    }
    public void printTime() {
        System.out.println(String.format("%02d", hr) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec));
    }
    public void changeHours(int change) {
        hr += change;
        if(hr >= 24)
            hr %= 24;
        else  if(hr < 0)
            hr %= -24;
    }
    public void changeMinutes(int change) {
        min += change;
        while(min >= 60) {
            changeHours(1);
            min -= 60;
        }
        while(min < 0) {
            changeHours(-1);
            min += 60;
        }
    }
    public void changeSeconds(int change) {
        sec += change;
        while(sec >= 60) {
            changeMinutes(1);
            sec -= 60;
        }
        while(sec < 0) {
            changeMinutes(-1);
            sec += 60;
        }
    }
    public boolean equals(Clock otherClock) {
        return (hr == otherClock.getHours() && min == otherClock.getMinutes() && sec == otherClock.getSeconds());
    }
    public void makeCopy(Clock otherClock) {
        hr = otherClock.getHours();
        min = otherClock.getMinutes();
        sec = otherClock.getSeconds();
    }
    public Clock getCopy() {
        return new Clock(hr, min, sec);
    }
}
