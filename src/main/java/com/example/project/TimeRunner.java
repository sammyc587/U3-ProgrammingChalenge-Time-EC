package com.example.project;
public class TimeRunner{
    public static void main(String[] args) {
        Time time1 = new Time(10, 14, 43);
        System.out.println(time1.info());
        Time time2 = new Time (8, 30, 29);
       time1.add(time2);
       System.out.println(time1.info());
    }
}