package StrTasks;

//В системе есть плейлист.
//
//У плейлиста есть:
//название
//список песен
//У каждой песни есть:
//название
//исполнитель
//длительность в секундах
//
//Нужно реализовать систему, которая может:
//добавить песню в плейлист
//удалить песню из плейлиста
//посчитать общую длительность плейлиста
//показать все песни в плейлисте
//
//Правила:
//общая длительность плейлиста считается как сумма длительностей всех песен
//если песня удалена, она больше не участвует в расчете
//
//Пример:
//В плейлисте есть песни:
//Believer — Imagine Dragons — 204
//Numb — Linkin Park — 185
//Halo — Beyonce — 261
//Общая длительность:
//650 секунд
public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return title + " — " + artist + " — " + duration;
    }
}
