package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBook()
    {
        //given
        Library theLibrary = new Library("Library number 1");

        Book book1 = new Book("Kot w butach 1", "John Smith", LocalDate.of(2001, 10, 10));
        Book book2 = new Book("Kot w butach 2", "John Smith", LocalDate.of(2002, 10, 10));
        Book book3 = new Book("Kot w butach 3", "John Smith", LocalDate.of(2003, 10, 10));
        Book book4 = new Book("Kot w butach 4", "John Smith", LocalDate.of(2004, 10, 10));

        theLibrary.getBooks().add(book1);
        theLibrary.getBooks().add(book2);
        theLibrary.getBooks().add(book3);
        theLibrary.getBooks().add(book4);

        Library clonedLibrary= null;
        try {
            clonedLibrary = theLibrary.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = theLibrary.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        theLibrary.getBooks().remove(book1);

        //Then
        System.out.println(theLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, theLibrary.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), theLibrary.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), theLibrary.getBooks());
    }
}
