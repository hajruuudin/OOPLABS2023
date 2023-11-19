package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LibraryCatalog {
    private ArrayList<Book> library;

    public LibraryCatalog(ArrayList<Book> catalog){
        this.library = catalog;
    }

    public Optional<Book> getBookAvailabilityByName(String name){
        Stream<Book> selectedBooks = this.library.stream()
                .filter(book -> book.title().equals(name) && book.available());

        return selectedBooks.findFirst();
    }

    public Optional<Book> getBookDetailsOfFirstAuthor(String author){
        Stream<Book> selectedBooks = this.library.stream()
                .filter(book -> book.author().equalsIgnoreCase(author));

        return selectedBooks.findFirst();
    }

    public void updateAvailability(String title, boolean newAvaliability){
        Stream<Book> books = this.library.stream()
                .filter(book -> book.title().equalsIgnoreCase(title));

        books.findFirst().ifPresent(book -> new Book(
                book.title(), book.author(), book.publicationYear(), newAvaliability
        ));
    }
}
