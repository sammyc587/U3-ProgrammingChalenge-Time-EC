package com.example.project;
public class TimeRunner{
    public static void main(String[] args) {
        Time time1 = new Time(18, 45, 14);
        System.out.println(time1.info());
        Time time2 = new Time (7, 20, 0);
       time1.add(time2);
       System.out.println(time1.info());
    }
}