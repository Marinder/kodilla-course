package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> empty1 = new ArrayList<Integer>();
        ArrayList<Integer> empty2 = new ArrayList<Integer>();
        //When
        OddNumbersExterminator exterminate1 = new OddNumbersExterminator();
        //Then
        Assert.assertEquals(exterminate1.exterminate(empty1),empty2);
    }

    @Test
    public void testOddNumbersExterminatorNormalList ()
    {
        //Given
        ArrayList<Integer> normal1 = new ArrayList<Integer>();
        normal1.add(1);
        normal1.add(2);
        normal1.add(3);
        normal1.add(4);
        normal1.add(5);
        normal1.add(6);

        ArrayList<Integer> normal2 = new ArrayList<Integer>();
        normal2.add(2);
        normal2.add(4);
        normal2.add(6);
        normal2.add(8);
        //When
        OddNumbersExterminator exterminate1 = new OddNumbersExterminator();
        //Then
        Assert.assertEquals(exterminate1.exterminate(normal1),normal2);
    }

}
