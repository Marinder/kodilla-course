package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate userBithDate;
    private final int userPublishedPost;

    public ForumUser(final int userId,final String userName,final char userSex,final LocalDate userBithDate,final int userPublishedPost) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userBithDate = userBithDate;
        this.userPublishedPost = userPublishedPost;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserBithDate() {
        return userBithDate;
    }

    public int getUserPublishedPost() {
        return userPublishedPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userBithDate=" + userBithDate +
                ", userPublishedPost=" + userPublishedPost +
                '}';
    }
}
