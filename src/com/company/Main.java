package com.company;
import java.util.*;

public class Main {

    // saved news
    // first news()

    public static void football() {

        String name, NewsAgency, title, Introduction, passage;
        int year, month, day;

        title = "Iran 1 - Syria 0 , The first step to the World Cup";
        name = "VARZESH3 NewsAgency";
        NewsAgency = "VARZESH3.COM";
        Introduction = "Iran's national team won its first game in the World Cup qualifiers.";
        passage = "According to \"Varzesh Seh\", the Iranian national football team, with 4 consecutive victories in its final 4 games in the second qualifying round of the 2022 World Cup\n, " +
                "had a hard but sweet ascent to the final qualifying round; At this stage, the Iranian national football team was grouped with the teams of South Korea, UAE, Syria, Lebanon and Iraq\n" +
                "today they played their first game against Azadi Stadium against Syria; The team that was ranked higher than China in the first group of the second qualifying round and advanced to the final round.\n" +
                " Skocic's students faced Syria on a night when he was absent from Azadi Stadium due to coronary heart disease. The first half of the match ended in a goalless draw.\n" +
                " In this half, both teams had chances to score, but in the end, they were tied. In the second half, Jahanbakhsh opened the Syrian gate very soon so that the Iranian national team could win the match against Syria with the same single goal.\n" +
                " With this victory, our national football team climbed to the top of the group table with three points due to the stoppage of South Korea against Iraq.";
        year = 2021;
        month = 9;
        day = 27;
        NewsPassage newNews = new NewsPassage(name, title, NewsAgency, Introduction, passage);
        for (int i = 0; i < 39; i -= -1)
            newNews.increaseLikesNews();
        for (int i = 0; i < 7; i -= -1)
            newNews.increaseDisLikeNews();
        newNews.percentageNews();
        date calendar = new date(day, month, year, title, Introduction, passage);
        ArrayList<String> aspComment;
        aspComment = new ArrayList<String>();
        aspComment.add("We owe this goal to the Syrian defense as well. The national team had nothing to say");
        aspComment.add("The team was totally uncoordinated, the reason being the lack of a preparatory game, however, the result is excellent.");
        aspComment.add("What mattered was the result we got. We will get better in the next games. As a fan, do not seek the share of club teams.\n This team is national and belongs to everyone. Support for the better.");
        aspComment.add("Wow, how badly the national team played .. God willing, they will play better in the next game. How bad Saman Qudus was. \nWe were lucky and we were not fired.");
        aspComment.add("We were completely lucky and we could have won on one occasion, otherwise we would not have had any tactics.\n The team was totally confused on the field. I hope we will continue to be more coordinated.");
        int index = 0;
        comments firstComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 12; n -= -1)
            firstComment.increaseLikes();
        for (int n = 0; n < 7; n -= -1)
            firstComment.increaseDisLike();
        firstComment.percentage();
        index -= -1;
        comments secondComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 30; n -= -1)
            secondComment.increaseLikes();
        for (int n = 0; n < 7; n -= -1)
            secondComment.increaseDisLike();
        secondComment.percentage();
        index -= -1;
        comments thirdComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 130; n -= -1)
            thirdComment.increaseLikes();
        for (int n = 0; n < 20; n -= -1)
            thirdComment.increaseDisLike();
        thirdComment.percentage();
        index -= -1;
        comments fourthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 57; n -= -1)
            fourthComment.increaseLikes();
        for (int n = 0; n < 48; n -= -1)
            fourthComment.increaseDisLike();
        fourthComment.percentage();
        index -= -1;
        comments fifthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 130; n -= -1)
            fifthComment.increaseLikes();
        for (int n = 0; n < 102; n -= -1)
            fifthComment.increaseDisLike();
        fifthComment.percentage();
        //print news
        calendar.printNewsDate();
        newNews.newsDisplay();
        firstComment.displayComment();
        secondComment.displayComment();
        thirdComment.displayComment();
        fourthComment.displayComment();
        fifthComment.displayComment();
        calendar.printTitleTime();

    }

    public static void fullStack() {

        String name, NewsAgency, title, Introduction, passage;
        int year, month, day;

        title = "Who is a full stack developer and what are its features?";
        name = "Milad dehyami";
        NewsAgency = "Code yad";
        Introduction = "If you have experience in programming or are interested in hiring a programmer for your business, you have probably heard the name Full Stack Developer many times before.\n" +
                " The question may arise for you who is this person and what characteristics should he have? ";
        passage = "Who is a full stack developer and what are its features?\n" +
                "If you have experience in programming or are interested in hiring a programmer for your business,\n" +
                " you have probably heard the name Full Stack Developer many times before.\n" +
                " The question may arise for you who is this person and what characteristics should he have?\n" +
                "A full-stack programmer is a programmer who is fully proficient in the concepts of front-end programming and back-end programming,\n" +
                " and is able to program in both directions.\n"+
                "People who are well versed in web programming know that to write a good quality site,\n" +
                " you need a front-end programmer to design the layout of your site pages, and you will also need a server-side or backend programmer.\n" +
                " The backend programmer must be fluent in the backend languages and design the core of the site.\n" +
                " Now a full-stack programmer is a programmer who is fluent in both front-end and programming languages and is able to program for you in both directions.\n" +
                "In this article, we are going to talk a little more about these programmers and developers and provide you with comprehensive information about job opportunities,\n" +
                " features and other specifications of these programmers.\n" +
                "Who is a full stack developer?\n" +
                "In the world of programming, sometimes there may be large projects that you normally need to complete several programmers to complete,\n" +
                " one group to design the interface and design your site, and another group to program the server part of your site. .\n" +
                "A full-stack programmer is someone who is able to complete such a project on his own because he is familiar with both the concepts of site design and server-side programming,\n" +
                " and is able to do both. In fact, this person has all the necessary skills to build and design a site.\n" +
                "One of the key features of Full Stack Developer is that it is able to have a beautiful design for your site and has enough taste and talent for graphic design,\n" +
                " and that it is able to design complex server-side services and unparalleled performance. Implement for your site. \n" +
                "Such programming must be both proficient in the security concepts of the site and able to optimize the various codes to increase the speed of your site.\n" +
                "What are the features of Full Stack Developer?\n" +
                "One of the main and important features of Full Stack Developer is that it has mastered all the intricacies of site design and programming and has been working in both fields for a long time.\n" +
                " Today, many people who are familiar with the concepts of site design and have little knowledge about site programming consider themselves a full-stack programmer.\n" +
                "Keep in mind that having information alone is not important, and you should also have enough experience and expertise in programming and site development.\n" +
                "Another important feature of a full-stack programmer is that they are able to analyze various problems well and solve them. The ability to solve a problem is very important for a full-stack programmer because when designing a site, he will probably face various problems and issues that he must be able to solve all of them. The ability to search to solve problems and errors in various codes is another feature of a full stack.";
        year = 2021;
        month = 9;
        day = 21;
        NewsPassage newNews = new NewsPassage(name, title, NewsAgency, Introduction, passage);
        for (int i = 0; i < 80; i -= -1)
            newNews.increaseLikesNews();
        for (int i = 0; i < 4; i -= -1)
            newNews.increaseDisLikeNews();
        newNews.percentageNews();
        date calendar = new date(day, month, year, title, Introduction, passage);
        ArrayList<String> aspComment;
        aspComment = new ArrayList<String>();
        aspComment.add("such a help full advantage i want to bee a Fullstack Developer in future");
        aspComment.add("Tnx mr.dehyami  ");
        aspComment.add("I suggest it for Developers its useful");
        aspComment.add("it's not adequate please take a revise but it was amazing outlook on this subject ");
        aspComment.add("please start your own course on html css and frontend programing as soon as possible mr.dehyami");
        int index = 0;
        comments firstComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 120; n -= -1)
            firstComment.increaseLikes();
        for (int n = 0; n < 8; n -= -1)
            firstComment.increaseDisLike();
        firstComment.percentage();
        index -= -1;
        comments secondComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 20; n -= -1)
            secondComment.increaseLikes();
        for (int n = 0; n < 4; n -= -1)
            secondComment.increaseDisLike();
        secondComment.percentage();
        index -= -1;
        comments thirdComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 87; n -= -1)
            thirdComment.increaseLikes();
        thirdComment.percentage();
        index -= -1;
        comments fourthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 96; n -= -1)
            fourthComment.increaseLikes();
        for (int n = 0; n < 82; n -= -1)
            fourthComment.increaseDisLike();
        fourthComment.percentage();
        index -= -1;
        comments fifthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 128; n -= -1)
            fifthComment.increaseLikes();
        for (int n = 0; n < 6; n -= -1)
            fifthComment.increaseDisLike();
        fifthComment.percentage();
        //print news
        calendar.printNewsDate();
        newNews.newsDisplay();
        firstComment.displayComment();
        secondComment.displayComment();
        thirdComment.displayComment();
        fourthComment.displayComment();
        fifthComment.displayComment();
        calendar.printTitleTime();

    }

    public static void asp() {

        String name, NewsAgency, title, Introduction, passage;
        int year, month, day;

        title = "What is Asp.Net Core";
        name = "Milad dehyami";
        NewsAgency = "Code yad";
        Introduction = "Writing a website requires learning a programming language. Many programming languages have been proposed for this purpose." + "\n" + "Including PHP, React, Node, Python. One of the best is Asp.Net Core. Asp is not a language; Rather, it is a framework built under the C # language.";
        passage = "Asp.Net Core is a framework and the programming language in which it is written is C #. C # is one of the most powerful programming languages. They use C # to design programs under Windows and write all kinds of programs with it.\n" + "C # is used to design large games using Unity. You can learn more about this field in the article How to learn game programming. It is a compiler language and communicates with a variety of databases. This language is also used to design Android and iOS apps by Xamarin.\n" +
                "The debate is why we should use Asp.Net Core. As we mentioned in the previous sections, there are different languages for site design that you can start coding with each of them, but why do we recommend asp, which you will surely understand by examining the features of this framework.\n" +
                "Cross-platform & container support\n" + "This feature makes it easy to run the app built by the Asp.Net Core framework on all platforms, and container support makes it easy for developers to use the cloud." +
                "High performance\n" + "One of the features of software is how it works. The use of IIS technology and support for various web servers make Asp.Net Core light and fast.";
        year = 2021;
        month = 8;
        day = 20;
        NewsPassage aspNews = new NewsPassage(name, title, NewsAgency, Introduction, passage);
        for (int i = 0; i < 24; i -= -1)
            aspNews.increaseLikesNews();
        for (int i = 0; i < 5; i -= -1)
            aspNews.increaseDisLikeNews();
        aspNews.percentageNews();
        date calendar = new date(day, month, year, title, Introduction, passage);
        ArrayList<String> aspComment;
        aspComment = new ArrayList<String>();
        aspComment.add("such a help full advantage");
        aspComment.add("Tnx mr.dehyami ");
        aspComment.add("I suggest it for amateurs its useful");
        aspComment.add("it's not adequate please take a revise ");
        aspComment.add("please start your own course on asp mr.dehyami");
        int index = 0;
        comments firstComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 28; n -= -1)
            firstComment.increaseLikes();
        for (int n = 0; n < 3; n -= -1)
            firstComment.increaseDisLike();
        firstComment.percentage();
        index -= -1;
        comments secondComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 10; n -= -1)
            secondComment.increaseLikes();
        for (int n = 0; n < 2; n -= -1)
            secondComment.increaseDisLike();
        secondComment.percentage();
        index -= -1;
        comments thirdComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 8; n -= -1)
            thirdComment.increaseLikes();
        thirdComment.percentage();
        index -= -1;
        comments fourthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 5; n -= -1)
            fourthComment.increaseLikes();
        for (int n = 0; n < 13; n -= -1)
            fourthComment.increaseDisLike();
        fourthComment.percentage();
        index -= -1;
        comments fifthComment = new comments(name, title, NewsAgency, aspComment.get(index));
        for (int n = 0; n < 3; n -= -1)
            fifthComment.increaseLikes();
        for (int n = 0; n < 6; n -= -1)
            fifthComment.increaseDisLike();
        fifthComment.percentage();
        //print news
        calendar.printNewsDate();
        aspNews.newsDisplay();
        firstComment.displayComment();
        secondComment.displayComment();
        thirdComment.displayComment();
        fourthComment.displayComment();
        fifthComment.displayComment();
        calendar.printTitleTime();

    }

    public static void newNews()
    {
        System.out.println("welcome (mr/mrs)Author");
        System.out.println("please fill this forms :");
        System.out.println("common form :");
        System.out.println("Author name : ");
        Scanner input1 = new Scanner(System.in);
        String NewName = input1.nextLine();
        System.out.println("News Agency : ");
        Scanner input5 = new Scanner(System.in);
        String newNewsAgency = input5.nextLine();
        System.out.println("------------------------------------------");
        System.out.println("date : ");
        System.out.println("date (year) : ");
        Scanner input2 = new Scanner(System.in);
        int newYear = input2.nextInt();
        System.out.println("date (month) : ");
        Scanner input3 = new Scanner(System.in);
        int newMonth = input3.nextInt();
        System.out.println("date (day) : ");
        Scanner input4 = new Scanner(System.in);
        int newDay = input4.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("context : ");
        System.out.println("Title : ");
        Scanner input6 = new Scanner(System.in);
        String newTitle = input6.nextLine();
        System.out.println("Introduction : ");
        Scanner input7 = new Scanner(System.in);
        String newIntroduction = input7.nextLine();
        System.out.println("passage : ");
        Scanner input8 = new Scanner(System.in);
        String newPassage = input8.nextLine();
        NewsPassage newNews = new NewsPassage(NewName, newTitle, newNewsAgency, newIntroduction, newPassage);
        System.out.println("How many person like this News ? ");
        Scanner newInput9 = new Scanner(System.in);
        int likeNum=newInput9.nextInt();
        for (int n = 0; n < likeNum; n -= -1)
            newNews.increaseLikesNews();
        System.out.println("How many person Dislike this News ? ");
        Scanner Input10 = new Scanner(System.in);
        int dislikeNum=Input10.nextInt();
        for (int n = 0; n < dislikeNum ;n -=-1)
            newNews.increaseDisLikeNews();
        newNews.percentageNews();
        date calendar = new date(newDay, newMonth, newYear, newTitle, newIntroduction, newPassage);
        ArrayList<comments> newNewsComment;
        newNewsComment = new ArrayList<comments>();
        int index = 0;
        calendar.printNewsDate();
        newNews.newsDisplay();
        calendar.printTitleTime();
        while (1==1) {
            System.out.println("Audience outlooks : ");
            System.out.println("Hello (Sir/Madam) please enter your comment on this News : ");
            System.out.println("Comment : ");
            Scanner newInput = new Scanner(System.in);
            String text=newInput.nextLine();
            comments Comment = new comments(NewName, newTitle, newNewsAgency, text);
            System.out.println("How many person had like this comment ? ");
            Scanner newInput1 = new Scanner(System.in);
            likeNum=newInput1.nextInt();
            for (int n = 0; n < likeNum; n -= -1)
                Comment.increaseLikes();
            System.out.println("How many person had Dislike this comment ? ");
            Scanner newInput2 = new Scanner(System.in);
            dislikeNum=newInput2.nextInt();
            for (int n = 0; n < dislikeNum ;n -=-1)
                Comment.increaseDisLike();
            Comment.percentage();
            newNewsComment.add(Comment);
            index -= -1;
            System.out.println("1) NEW Comment");
            System.out.println("Press any key to exit");
            Scanner choice = new Scanner(System.in);
            int decide=choice.nextInt();
            if(decide==1)
                   break;
        }
        //print news
        calendar.printNewsDate();
        newNews.newsDisplay();
        for (comments item : newNewsComment){
            item.displayComment();
        }
        calendar.printTitleTime();
    }

    public static void main(String[] args) {

        //int newsNumber=0;
        /*ArrayList<News> newsHead ;
        newsHead = new ArrayList<News>();
        ArrayList<NewsPassage> text ;
        text = new ArrayList<NewsPassage>();
        ArrayList<Date> date ;
        date = new ArrayList<Date>();*/
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("welcome to our online news paper");
        while (1 == 1) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("which one is your roll :");
            System.out.println("1) Editor/Reporter ");
            System.out.println("2) Audience");
            System.out.println("3) Exit");
            System.out.println("----------------------------------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1)
                newNews();

            if(choice ==2)
            {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("1) Asp.net core");
                System.out.println("2) Full Stack developer");
                System.out.println("3) Iran world cup 2022");
                System.out.println("4) All News");
                System.out.println("----------------------------------------------------------------------------------------");
                Scanner input2 = new Scanner(System.in);
                choice = input2.nextInt();
                if(choice==1)
                    asp();
                else if(choice==2)
                    fullStack();
                else if(choice==3)
                    football();
                else {
                    System.out.println("----------------------------------------------------------------------------------------");
                    asp();
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------------------------");
                    fullStack();
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------------------------");
                    football();
                    System.out.println("----------------------------------------------------------------------------------------");
                }

            }
            if(choice==3){
                System.out.println("See you later"+"\n"+"Good bye * _ ^");
                break;
            }
        }
    }
}
