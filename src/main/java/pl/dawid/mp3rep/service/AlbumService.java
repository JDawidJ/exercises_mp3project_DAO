package pl.dawid.mp3rep.service;

import pl.dawid.mp3rep.model.Album;
import pl.dawid.mp3rep.model.Artist;

import java.time.Year;
import java.util.List;

public interface AlbumService {

    public AlbumCreationResult createNewAlbum(Album newAlbum);
    public  boolean deleteAlbum(Album album);
    public  Album updateAlbum(Album updated);
    public List<Album>findAllAlbum();
    public List<Album>findAlbumsFromCategory(String category);
    public List<Album>findAlbumOfGivenArtist(Artist artist);
    public  List<Album>findAlbumFromGivenYear();
    public  List<Album>findAlbumGivenYear(Year year);
    public  List<Album>findFavouriteAlbums();


}
