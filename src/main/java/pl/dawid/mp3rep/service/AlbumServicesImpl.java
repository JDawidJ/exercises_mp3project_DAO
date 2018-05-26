package pl.dawid.mp3rep.service;

import pl.dawid.mp3rep.dao.AlbumDao;
import pl.dawid.mp3rep.model.Album;
import pl.dawid.mp3rep.model.Artist;

import java.time.Year;
import java.util.List;

public class AlbumServicesImpl implements AlbumService {
    public AlbumServicesImpl(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    private AlbumDao albumDao;

    @Override
    public AlbumCreationResult createNewAlbum(Album newAlbum) {
        return null;
    }

    @Override
    public boolean deleteAlbum(Album album) {
        return false;
    }

    @Override
    public Album updateAlbum(Album updated) {
        return null;
    }

    @Override
    public List<Album> findAllAlbum() {
        return albumDao.readAllAlbum();

    }

    @Override
    public List<Album> findAlbumsFromCategory(String category) {
        return null;
    }

    @Override
    public List<Album> findAlbumOfGivenArtist(Artist artist) {
        return null;
    }

    @Override
    public List<Album> findAlbumFromGivenYear() {
        return null;
    }

    @Override
    public List<Album> findAlbumGivenYear(Year year) {
        return null;
    }

    @Override
    public List<Album> findFavouriteAlbums() {
        return null;
    }
}
