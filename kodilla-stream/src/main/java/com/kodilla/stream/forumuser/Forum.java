package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1, "Marcin Kot",'M', LocalDate.of(1999, 11,21), 1));
        theForumUserList.add(new ForumUser(2, "Dawid Mal",'M', LocalDate.of(2001, 10,23), 13));
        theForumUserList.add(new ForumUser(3, "Joanna  Kot",'F', LocalDate.of(1995, 12,24), 12));
        theForumUserList.add(new ForumUser(4, "Katarzyna Pwierz",'F', LocalDate.of(1997, 9,25), 11));
        theForumUserList.add(new ForumUser(5, "Dawid Kit",'M', LocalDate.of(1993, 1,1), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
