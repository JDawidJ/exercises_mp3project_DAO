package pl.dawid.mp3rep.model;

public class Song {
    private int length;
    private  String name;
    private Album album;
    private String rating;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Song{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", album=" + album +
                ", rating='" + rating + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (length != song.length) return false;
        if (name != null ? !name.equals(song.name) : song.name != null) return false;
        if (album != null ? !album.equals(song.album) : song.album != null) return false;
        return rating != null ? rating.equals(song.rating) : song.rating == null;
    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }
}
