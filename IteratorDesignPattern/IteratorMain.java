package IteratorDesignPattern;

import java.util.*;

public class IteratorMain {
    
    public static void main(String args[]) {
        List<Book> booksList = Arrays.asList(new Book(1,"X"),new Book(2,"Y"),new Book(3,"Z"),new Book(4,"A"));
        Library lib = new Library(booksList);
        Iterator itr = lib.createIterator();

        while(itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book.getBookName());
        }
    }
}
