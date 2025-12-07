package IteratorDesignPattern;

import java.util.*;
public class BookIterator implements Iterator{
    List<Book>books;
    int index; 
    public BookIterator(List<Book>books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }
    @Override
    public Object next() {
        if(index < books.size()) {
            return books.get(index++);
        }
        return null;
    }
}
