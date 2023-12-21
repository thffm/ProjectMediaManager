package model.services;

import java.time.LocalDate;

public interface Media {
    String getTitle();
    String getCreator();
    LocalDate getYear();
    void displayInformation();
}
