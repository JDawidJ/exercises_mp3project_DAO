package pl.dawid.mp3rep.dao;

import pl.dawid.mp3rep.model.Album;
import pl.dawid.mp3rep.model.Artist;

import java.time.Year;
import java.util.List;

public interface AlbumDao {

    boolean saveNewAlbum(Album album);

    Album updateAlbum(Album updated);

    boolean deleteAlbums(Album toDelete);

    public List<Album> readAllAlbum();
    public List<Album>readAlbumsFromCategory(String category);
    public List<Album>readAlbumOfGivenArtist(Artist artist);
    public  List<Album>readAlbumFromGivenYear();
    public  List<Album>readAlbumGivenYear(Year year);
    public  List<Album>readFavouriteAlbums();

}
