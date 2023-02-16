package lab5.task4;

import lab5.task4.Album;
import java.util.ArrayList;

public class BadAlbum extends Album{

    @Override
    public void addSong(Song song) {
        int n, cn, ogl;
        n=song.getId();
        cn=n;
        ogl = 0;
        while (n != 0)
        {
            ogl = ogl * 10 + n % 10;
            n = n / 10;
        }
        if((song.getName().length() == 3) && (cn == ogl))
            super.getSongs().add(song);
    }
}
