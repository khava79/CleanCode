package StrTasks;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();

    }
    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public int getTotalDuration() {
        int total = 0;
        for (Song s : songs) {
            total += s.getDuration();
        }
        return total;
    }
    public void showAllSongs() {
        System.out.println("Плейлист: \"" + name + "\"");
        for (Song s : songs) {
            System.out.println(s);
        }
        System.out.println("Общая длительность: " + getTotalDuration() + "секунд");
    }
}
