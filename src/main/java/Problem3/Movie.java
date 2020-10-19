package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        // homework
        this.id = UUID.randomUUID();
        this.title = title;
        this.rating = rating;

    }

    public Movie(Movie anotherMovie) {
        // homework
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
        this.id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        //homework
        Movie m = (Movie) obj;
        if ((m.title == this.title) && (m.id == this.id) && (m.rating == this.rating)) {
            return true;
        } else {
            return false;
        }
    }
}
