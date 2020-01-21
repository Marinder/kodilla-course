package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTest {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testWhenTheNumberOfPostsEquals1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("User1");
        user.add("User2");
        user.add("User3");
        user.add("User4");
        user.add("User5");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStat.getNumberOfUsers());
        assertEquals(100, forumStat.getNumberOfComments());
        assertEquals(1000, forumStat.getNumberOfPosts());
        assertEquals(200, forumStat.getAverageNumberOfPostsPerUser(), 0.001);
        assertEquals(0.1, forumStat.getAverageNumberOfCommentsPerPost(), 0.001);
        assertEquals(20, forumStat.getAverageNumberOfCommentsPerUser(), 0.001);

    }

    @Test
    public void testWhenTheNumberOfCommentsIsLessThanTheNumbeOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("User1");
        user.add("User2");
        user.add("User3");
        user.add("User4");
        user.add("User5");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStat.getNumberOfUsers());
        assertEquals(1000, forumStat.getNumberOfPosts());
        assertEquals(100, forumStat.getNumberOfComments());
        assertEquals(200, forumStat.getAverageNumberOfPostsPerUser(), 0.001);
        assertEquals(20, forumStat.getAverageNumberOfCommentsPerUser(), 0.001);
        assertEquals(0.1, forumStat.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testWhenTheNumberOfCommentsIsGreaterThanTheNumbeOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("User1");
        user.add("User2");
        user.add("User3");
        user.add("User4");
        user.add("User5");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStat.getNumberOfUsers());
        assertEquals(100, forumStat.getNumberOfPosts());
        assertEquals(1000, forumStat.getNumberOfComments());
        assertEquals(20, forumStat.getAverageNumberOfPostsPerUser(), 0.001);
        assertEquals(200, forumStat.getAverageNumberOfCommentsPerUser(), 0.001);
        assertEquals(10, forumStat.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testWhenTheNumberOfUsersIs100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        for ( int i=0; i < 100; i++){
            user.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStat.getNumberOfUsers());
        assertEquals(100, forumStat.getNumberOfPosts());
        assertEquals(1000, forumStat.getNumberOfComments());
        assertEquals(1, forumStat.getAverageNumberOfPostsPerUser(), 0.001);
        assertEquals(10, forumStat.getAverageNumberOfCommentsPerUser(), 0.001);
        assertEquals(10, forumStat.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testWhenTheNumberOfCommentsEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("User1");
        user.add("User2");
        user.add("User3");
        user.add("User4");
        user.add("User5");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStat.getNumberOfUsers());
        assertEquals(1000, forumStat.getNumberOfPosts());
        assertEquals(0, forumStat.getNumberOfComments());
        assertEquals(200, forumStat.getAverageNumberOfPostsPerUser(), 0.1);
        assertEquals(0, forumStat.getAverageNumberOfCommentsPerUser(), 0);
        assertEquals(0, forumStat.getAverageNumberOfCommentsPerPost(), 0);
    }

    @Test
    public void testWhenTheNumberOfUsersEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStat.getNumberOfUsers());
        assertEquals(0, forumStat.getNumberOfPosts());
        assertEquals(0, forumStat.getNumberOfComments());
        assertEquals(0.0, forumStat.getAverageNumberOfPostsPerUser(), 0);
        assertEquals(0.0, forumStat.getAverageNumberOfCommentsPerUser(), 0);
        assertEquals(0.0, forumStat.getAverageNumberOfCommentsPerPost(), 0);
    }

    @Test
    public void testWhenTheNumberOfPostsEquals0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> user = new ArrayList<>();
        user.add("User1");
        user.add("User2");
        user.add("User3");
        user.add("User4");
        user.add("User5");
        when(statisticsMock.usersNames()).thenReturn(user);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStat forumStat = new ForumStat();
        //When
        forumStat.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(5, forumStat.getNumberOfUsers());
        assertEquals(0, forumStat.getNumberOfPosts());
        assertEquals(0, forumStat.getNumberOfComments());
        assertEquals(0, forumStat.getAverageNumberOfPostsPerUser(), 0.0);
        assertEquals(0, forumStat.getAverageNumberOfCommentsPerPost(), 0.0);
        assertEquals(0, forumStat.getAverageNumberOfCommentsPerUser(), 0.0);


    }


}
