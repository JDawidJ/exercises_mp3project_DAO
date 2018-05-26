package pl.dawid.mp3rep.model.services;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import pl.dawid.mp3rep.dao.AlbumDao;
import pl.dawid.mp3rep.model.Album;
import pl.dawid.mp3rep.model.Artist;
import pl.dawid.mp3rep.service.AlbumService;
import pl.dawid.mp3rep.service.AlbumServicesImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlbumServicesTest {
AlbumDao albumDao;
AlbumService albumService;
List<Album>albums;
Artist defaultArtist;
@Before
public  void init (){
    defaultArtist = new Artist();
    albumDao=mock(AlbumDao.class);
    albumService=new AlbumServicesImpl(albumDao);
    albums=new ArrayList<>();
    albums.add(new Album(Collections.emptyList(),"cos tam",defaultArtist));
    albums.add(new Album(Collections.emptyList(),"cos",defaultArtist));
}
    @Test
    public void readAllAlbumsTest(){
when(albumDao.readAllAlbum()).thenReturn(albums);
        System.out.println(albumService.findAllAlbum());
    }
}
