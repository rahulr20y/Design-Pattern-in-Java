package com.designpattern.learningdesignpattern.behavioral.IteratorPattern.Solution1WithIteratorPattern;

import java.util.List;

public class BookIterator implements MyIterator {
    private List<Book> booksList;
    private int index = 0;

    public BookIterator(List<Book> list) {
        this.booksList = list;
    }

    @Override
    public boolean hasNext() {
        return index < booksList.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return booksList.get(index++);
        }
        return null;
    }

}
