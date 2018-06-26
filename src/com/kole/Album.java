package com.kole;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSongToAlbum(String songName, double songDuration){
        if (findSong(songName)==null){
            this.songs.add(new Song(songName,songDuration));
        }
    }

    private Song findSong(String songName){
        for (Song tempSong : this.songs){
            if (tempSong.getName().equals(songName)){
                return tempSong;
            }else {
                return null;
            }
        }return null;
    }


}