import model.entities.Book;
import model.entities.Item;
import model.entities.Movie;
import model.services.Media;
import model.services.MediaManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Item book = new Book("python","Josef", LocalDate.parse("20/10/0005",fmt));
        Item movie = new Movie("Batman","LUITITO",LocalDate.parse("10/05/2002",fmt));
        MediaManager serviceMedia = new MediaManager();
        serviceMedia.addMedia(book);
        serviceMedia.addMedia(movie);
        serviceMedia.listMedia();




    }

}