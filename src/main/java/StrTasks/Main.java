package StrTasks;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Мой плейлист");

        playlist.addSong(new Song("Believer", "Imagine Dragons", 204));
        playlist.addSong(new Song("Numb", "Linkin Park", 185));
        playlist.addSong(new Song("Halo", "Beyonce", 261));

        playlist.removeSong(new Song("Numb", "Linkin Park", 185));
        playlist.showAllSongs();

        playlist.getTotalDuration();


    }

}
