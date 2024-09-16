package com.example.springuploadmusic.model;

import java.util.List;

public class Music {
    private String nameSong;
    private String nameSinger;
    private List<String> genres;
    private String filePath;

    public Music() {
    }

    public Music(String nameSong, String nameSinger, List<String> genres, String filePath) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.genres = genres;
        this.filePath = filePath;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
