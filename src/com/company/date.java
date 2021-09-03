package com.company;
import java.util.*;

public class date extends NewsPassage{

    private long timestamp;
    private int day;
    private int month;
    private int year;

    public date(int day,int month,int year,String title,String introduction,String text){
        super(title,introduction,text);
        timestamp = System.currentTimeMillis();
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void printTitleTime(){
        System.out.println("Past tense of news release :" + timestamp);
    }

    public void printNewsDate(){
        System.out.println("Date : " + year+"/"+month+"/"+day);
        super.printNews();
    }
}
