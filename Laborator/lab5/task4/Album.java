package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    private ArrayList<Song> songs = new ArrayList<Song>();

    public abstract void addSong(Song song);

    public void removeSong(){
        songs.remove(songs.size()-1);
    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
