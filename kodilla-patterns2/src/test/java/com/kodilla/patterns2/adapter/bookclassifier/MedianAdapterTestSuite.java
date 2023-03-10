package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book dumaKey = new Book("Jakub C", "Ryby", 2014, "S1");
        Book trhlina = new Book("kacper J", "jak obierac ziemniaki", 2021, "S2");
        Book dejaDead = new Book("szymon W", "jak zrobić ogórkową", 2021, "S3");
        Book doberman = new Book("adam adam ", "jak żyć ", 2014, "S4");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(dumaKey);
        bookSet.add(trhlina);
        bookSet.add(dejaDead);
        bookSet.add(doberman);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println("The median of publication year is: " + median);
        Assertions.assertEquals(2017, median);
    }
}
