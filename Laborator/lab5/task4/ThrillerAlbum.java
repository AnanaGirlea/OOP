package lab5.task4;

import lab5.task4.Album;
import java.util.ArrayList;

public class ThrillerAlbum extends Album{

    @Override
    public void addSong(Song song) {
        if((song.getComposer() == "Michael Jackson") && (song.getId() % 2 ==0))
            super.getSongs().add(song);
    }
}
