package lab5.task4;

import lab5.task4.Album;
import java.util.ArrayList;

public class DangerousAlbum extends Album{

    @Override
    public void addSong(Song song) {
        boolean prim=true;
        if(song.getId() < 2)
            prim = false;
        for(int d =2 ; d * d <= song.getId() ; d ++)
            if(song.getId() % d == 0)
                prim = false;
        if (prim)
            super.getSongs().add(song);
    }
}
