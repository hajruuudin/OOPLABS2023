package Task4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;



class Song{
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

class GenreFilterIterator implements Iterator<Song> {
    private ArrayList<Song> playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(ArrayList<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size()) {
            if (playlist.get(currentIndex).getGenre().equals(targetGenre)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs with the target genre");
        }
        return playlist.get(currentIndex++);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<Song>();
        playlist.add(new Song("Song1", "Artist1", "Rock"));
        playlist.add(new Song("Song2", "Artist2", "Turbo Folk"));
        playlist.add(new Song("Song3", "Artist3", "Rock"));
        playlist.add(new Song("Song4", "Artist4", "Classic"));

        GenreFilterIterator thing = new GenreFilterIterator(playlist, "Rock");

        while(thing.hasNext()){
            Song song = thing.next();
            System.out.println("Title: " + song.getTitle() +
                    ", Artist: " + song.getArtist() +
                    ", Genre: " + song.getGenre());
        }
    }
}
