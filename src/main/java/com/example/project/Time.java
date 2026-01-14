package com.example.project;

public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hour;
    private int minute;
    private int second;

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //GETTERS 
 

    public String info(){
        String hours = Integer.toString(hour);
        String minutes = Integer.toString(minute);
        String seconds = Integer.toString(second);
        if (hour < 10){
        hours = "0" + Integer.toString(hour);            
        }
        if (minute < 10){
        minutes = "0" + Integer.toString(minute);            
        }
        if (second < 10){
        seconds = "0" + Integer.toString(second);            
        }
        return hours + ":" + minutes + ":" + seconds ;
}


    public void tick(){
      if (second == 59){
        second = 0;
        if (minute == 59){
            minute = 0;
            if (hour == 23){
                hour = 0;
            } else {
                hour++;
            }
        } else {
            minute++;
        }
      } else {
        second ++;
      }
    }


    public void add(Time time2){
        second += time2.second;
        if (second >= 60){
            minute += second/60;
            second %= 60;
        }
        minute += time2.minute;
        if (minute >= 60){
            hour += minute/60;
            minute %= 60;
        }
        hour += time2.hour;
            hour %= 24;
        
    }
}

