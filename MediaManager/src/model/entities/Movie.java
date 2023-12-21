package model.entities;

import model.services.Media;

import java.time.LocalDate;

public class Movie extends Item {

    public Movie(String title, String creator, LocalDate year) {
        super(title, creator, year);
    }

    @Override
    public void displayInformation() {
        System.out.println("Movie Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getCreator());
        System.out.println("Year: " + getYear());

    }
}


