package model.entities;

import model.services.Printable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book implements Printable {
    public  static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String title;
    private String author;

    private LocalDate publicationYear;

    public Book(String title, String author, LocalDate publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: "+getTitle()+"\n");
        sb.append("Author: "+getAuthor()+"\n");
        sb.append("Publicantion Year: "+fmt.format(getPublicationYear())+"\n");
        return sb.toString();
    }

    @Override
    public void print() {
        toString();
    }
}
