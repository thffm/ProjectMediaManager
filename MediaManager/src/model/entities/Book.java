package model.entities;

import model.services.Media;

import java.time.LocalDate;

public class Book extends Item {


    public Book(String title, String creator, LocalDate year) {
        super(title, creator, year);
    }

    @Override
    public void displayInformation() {
        System.out.println("Book Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getCreator());
        System.out.println("Year: " + getYear());
    }
}
