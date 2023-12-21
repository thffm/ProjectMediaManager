package model.entities;

import model.services.Printable;

import java.util.ArrayList;
import java.util.List;

public class Library implements Printable {
    List<Book>collection = new ArrayList<>();

    public  Library(){

    }

    public void addBook(Book book){
        collection.add(book);
    }

    public void listBooks(){
        for (Book item:collection){
            System.out.println(item);
        }
    }

    @Override
    public void print() {
        System.out.println("Library Contents:");
        listBooks();
    }
}
