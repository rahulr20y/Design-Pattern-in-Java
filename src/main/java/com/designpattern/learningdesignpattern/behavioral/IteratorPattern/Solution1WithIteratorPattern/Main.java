package com.designpattern.learningdesignpattern.behavioral.IteratorPattern.Solution1WithIteratorPattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Behavioral Pattern");
        /*
         * Provides way to access elements sequentially without exposing the underlying
         * representation of collection
         */

        // example 1
        Set<Integer> listSet = new LinkedHashSet<>();
        listSet.add(25);
        listSet.add(66);
        listSet.add(11);
        Iterator<Integer> iterable = listSet.iterator();
        while (iterable.hasNext()) {
            int val = iterable.next();
            System.out.println(val);
        }

        // example 2

        List<Book> bookList = Arrays.asList(new Book(233, "Kite"), new Book(445, "Runner"), new Book(55, "strange"));

        Library library = new Library(bookList);
        MyIterator bookIterator = library.createIterator();

        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book);
        }
    }
}
