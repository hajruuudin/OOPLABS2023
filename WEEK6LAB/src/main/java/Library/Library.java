package Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library(){
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.library.add(book);
    }

    public void printBooks(){
        for(Book book : this.library){
            System.out.println(book);
        }
    }

    //Comment: for some reason the StringUtils library is not available on my machine.
    // Because of this it required me to download the additional packets.
    // I didn't do it since I assume that this is just an error on my machine.
    // In any case the task doesn't change anything except make the code easier to read.

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.library){
            if (book.title().contains(title)){
                found.add(book);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.library){
            if (book.title().contains(publisher)){
                found.add(book);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();

        for(Book book : this.library){
            if (book.year() == year){
                found.add(book);
            }
        }

        return found;
    }
}
