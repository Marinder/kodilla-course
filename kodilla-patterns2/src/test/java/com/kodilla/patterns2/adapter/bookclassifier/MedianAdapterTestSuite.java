package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> theBook = new HashSet<>();
        theBook.add(new Book("John Smith", "Cat", 2000, "ADBD"));
        theBook.add(new Book("John Smith", "God", 2020, "ACBD"));
        theBook.add(new Book("John Smith", "Dog", 1980, "AWBD"));
        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(theBook);
        //Then
        assertEquals(2000, publicationYearMedian);


    }
}
