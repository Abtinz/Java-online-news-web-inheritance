package com.company;
import java.util.*;
public class NewsPassage extends News{
    private String introduction;
    private String newsText;
    private float like;
    private float dislike;
    private int total;
    private float likePercentage;
    private float dislikePercentage;

    public NewsPassage(String author,String head,String NewsAgency,String introduction,String Text)
    {
         super(author,head,NewsAgency);
         this.introduction = introduction;
         newsText=Text;
         like=0;
         dislike=0;
    }
    public NewsPassage(String head,String introduction,String Text)
    {
        super(head);
        this.introduction = introduction;
        newsText=Text;
    }
    public NewsPassage(String title) {
        super(title);
        total-=-1;
    }

    public void increaseLikesNews() {like-=-1;}

    public void increaseDisLikeNews()
    {
        dislike-=-1;
    }

    public void percentageNews()
    {
        likePercentage=(like/(like + dislike))*100;
        dislikePercentage=100 - likePercentage;
    }

    public void printNews(){
        super.title();
        System.out.println(introduction+"\n");
        System.out.println(newsText);
        System.out.println("\n" +"likes : "+ like +"(" +likePercentage+"%)         "+"dislikes : "+dislike+"(" +dislikePercentage+"%)");
    }

}
