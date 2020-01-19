package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testAddFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        figure.addFigure(shape);
        //Then
        Assert.assertEquals(1, figure.getArrayListSize());


    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape shape = new Circle(1);
        figure.addFigure(shape);
        //When
        figure.removeFigure(shape);
        //Then
        Assert.assertEquals(0, figure.getArrayListSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Shape shape = new Circle(1);
        figure.addFigure(shape);
        //When
        Shape shape0 = figure.getFigure(0);
        //Then
        Assert.assertEquals(shape0, shape);

    }
}
