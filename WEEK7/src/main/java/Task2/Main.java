package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Book1", "Author1", 2022, true));
        bookList.add(new Book("Book2", "Author2", 2020, false));
        bookList.add(new Book("Book3", "Author1", 2019, true));
        bookList.add(new Book("Book4", "Author3", 2021, true));

        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        Optional<Book> availableBook = libraryCatalog.getBookAvailabilityByName("Book1");
        if(availableBook.isPresent()){
            System.out.println("Book is present");
        }

        Optional<Book> bookDetails = libraryCatalog.getBookDetailsOfFirstAuthor("Author2");
        if(bookDetails.isPresent()){
            System.out.println(bookDetails);
        }

        Optional<Book> changeAvailability = libraryCatalog.getBookAvailabilityByName("Book2");
        if(changeAvailability.isPresent()){
            libraryCatalog.updateAvailability("Book2", true);
        }

        System.out.println();
    }
}
