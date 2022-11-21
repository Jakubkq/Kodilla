package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library: first");

        Book book1 = new Book("xxxx", "xxxx",
                LocalDate.of(2013, 2, 8));
        Book book2 = new Book("yyyyy", "yyyyy",
                LocalDate.of(1988, 4, 9));
        Book book3 = new Book("uuuuuu", "iiiiii",
                LocalDate.of(1999, 8, 31));
        Book book4 = new Book("iiiiiii", "oooooo",
                LocalDate.of(1971, 2, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library: second");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary=null;
        try{
            deepCloneLibrary=library.deepCopy();
            deepCloneLibrary.setName("Library: third");}
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book2);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, cloneLibrary.getBooks().size());
        assertEquals(4, deepCloneLibrary.getBooks().size());
    }
}

