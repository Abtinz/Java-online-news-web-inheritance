package com.company;
import java.util.*;
public class News {
    private String name;
    private String mainTitle;
    private String NewsAgency;

    public News(String author,String title,String NewsAgency){
        name=author;
        mainTitle=title;
        this.NewsAgency=NewsAgency;
    }
    public News(String title){
        mainTitle=title;

    }

    public void title() {
        System.out.println("Recent News :");
        System.out.println(mainTitle);
    }

    public void newsDisplay(){
        System.out.println("Author : "+ name);
        System.out.println("News Agency : "+NewsAgency);
        System.out.println("Comments :");
    }
}
