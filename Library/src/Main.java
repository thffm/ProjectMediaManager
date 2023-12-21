import model.entities.Book;
import model.entities.Library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Library libraryMariana = new Library();

        Book python = new Book("Python Snake","Jusefino",LocalDate.parse("27/04/2004",Book.fmt));
        Book noPregnant = new Book("Lidia nao esta gravida","Jusefino",LocalDate.parse("20/12/2023",Book.fmt));
        libraryMariana.addBook(python);
        libraryMariana.addBook(noPregnant);
        libraryMariana.print();



    }
}