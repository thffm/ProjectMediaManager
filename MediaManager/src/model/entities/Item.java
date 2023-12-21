package model.entities;

import model.services.Media;

import java.time.LocalDate;

public abstract  class Item implements Media {
    private String title;
    private String creator;
    private LocalDate year;

    public Item(String title, String creator, LocalDate year) {
        this.title = title;
        this.creator = creator;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }
}
