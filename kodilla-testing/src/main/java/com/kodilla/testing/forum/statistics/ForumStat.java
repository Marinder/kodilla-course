package com.kodilla.testing.forum.statistics;

public  class ForumStat{

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averageNumberOfPostsPerUser;
    double averageNumberOfCommentsPerUser;
    double averageNumberOfCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();

        if (numberOfUsers > 0) {
            averageNumberOfPostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
            averageNumberOfCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts > 0) {
            averageNumberOfCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
            System.out.println("Number of Users: " + numberOfUsers);
            System.out.println("Number of Comments: " + numberOfComments);
            System.out.println("Number of Posts: " + numberOfPosts);
            System.out.println("Average number of Posts per User: " + averageNumberOfPostsPerUser);
            System.out.println("Average number of Comments per user: " + averageNumberOfCommentsPerUser);
            System.out.println("Average number of Comments per Post: " + averageNumberOfCommentsPerPost);
    }

}
