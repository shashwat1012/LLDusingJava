package IteratorDesignPattern;

import java.util.*;
//this library class is a concrete aggregate, which has the collection of books
public class Library implements Aggregate{
    List<Book> booksList;
    public Library(List<Book>booksList) {
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(booksList);
    }
}
