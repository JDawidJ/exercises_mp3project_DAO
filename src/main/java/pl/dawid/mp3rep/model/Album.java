package pl.dawid.mp3rep.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import java.math.BigDecimal;
import java.util.List;

public class Album {
    private List <Song>lisata;
    private String nameAlbum;
    private Artist artist;
    private String category;
    private String studio;
    private int year;
    private int rate;
    private BigDecimal price;
    private mediaType mediaType;

    public void AddSong(Song song){
        this.lisata.add(song);
    }

    public Album(List<Song> lisata, String nameAlbum, Artist artist) {
        this.lisata = Preconditions.checkNotNull(lisata,"eroor1");

        if(Strings.isNullOrEmpty(nameAlbum)){
            throw new IllegalArgumentException("cannot be empty");
        }
        this.artist = Preconditions.checkNotNull(artist,"error2");
    }

    public Album(List<Song> lisata, String nameAlbum, Artist artist, String category, String studio, int year, int rate, BigDecimal price, pl.dawid.mp3rep.model.mediaType mediaType) {
      this(lisata, nameAlbum, artist);
        this.category = category;
        this.studio = studio;
        this.year = year;
        this.rate = rate;
        this.price = price;
        this.mediaType = mediaType;
    }
}
