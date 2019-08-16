package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CalculateStatistics {

    private int usersCounter;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCounter = statistics.userNames().size();

        postsNumber = statistics.postsCount();

        commentsNumber = statistics.commentsCount();

        if (usersCounter == 0) {
            averagePostsNumberPerUser = 0;
            averageCommentsNumberPerUser = 0;
        } else {
            averagePostsNumberPerUser = postsNumber / usersCounter;
            averageCommentsNumberPerUser = commentsNumber / usersCounter;
        }
        if (commentsNumber == 0) {
            averageCommentsNumberPerPosts = 0;
        } else {
            averageCommentsNumberPerPosts = (double)postsNumber / (double)commentsNumber;
        }

    }

    public int getUsersCounter() {
        return usersCounter;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPosts() {
        return averageCommentsNumberPerPosts;
    }
    //public void showStatistics() {}

}
