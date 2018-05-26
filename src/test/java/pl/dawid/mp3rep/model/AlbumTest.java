package pl.dawid.mp3rep.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class AlbumTest {
    @Test
    public void creationAlbum_success(){
        Album newAlbum=new Album(Collections.emptyList(),"tytul",new Artist());
        Assert.assertNotNull("problem",newAlbum);

    }
    @Test(expected = NullPointerException.class)
    public void creationAlbum_nullSongList(){
        Album newAlbum=new Album(null,"title",new Artist());
    }
    @Test(expected = IllegalArgumentException.class)
    public  void creatinAlbum_emptyTitle(){
        Album newAlbum=new Album(Collections.emptyList(),null,new Artist());
    }
    @Test(expected = NullPointerException.class)
    public void creationAlbum_nullPerformer(){
        Album newAlbum=new Album(Collections.emptyList(),"title",null);
    }
}
