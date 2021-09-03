package com.company;
import java.util.*;
public class comments extends News{

    private String comment;
    private float like;
    private float dislike;
    private float likePercentage;
    private float dislikePercentage;
    public comments(String author,String head,String NewsAgency,String outlook)
    {
        super(author,head,NewsAgency);
        comment = outlook;
        like=0;
        dislike=0;
    }
    public void increaseLikes() { like-=-1; }

    public void increaseDisLike()
    {
        dislike-=-1;
    }

    public void percentage()
    {
        likePercentage=(like /(like+ dislike))*100;
        dislikePercentage=100 - likePercentage;
    }

    public void displayComment(){
        System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("comment : "+comment);
            System.out.println("\n" +"likes : "+ like +"(" +likePercentage+"%)         "+"dislikes : "+dislike+"(" +dislikePercentage+"%)");
    }

}
