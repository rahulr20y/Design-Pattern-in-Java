package com.designpattern.learningdesignpattern.behavioral.IteratorPattern.Solution1WithIteratorPattern;

import java.util.List;

public class Library {
    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public MyIterator createIterator() {
        return new BookIterator(books);
    }
}
