package model.entities;

import java.time.LocalDate;

public class Music extends Item{

    private String artist;

    public Music(String title, String creator, LocalDate year, String artist) {
        super(title, creator, year);
        this.artist = artist;
    }

    @Override
    public void displayInformation() {
        System.out.println("Music Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Artist: " + getCreator());
        System.out.println("Year: " + getYear());

    }
}
