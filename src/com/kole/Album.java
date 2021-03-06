package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

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
            }
        }return null;
    }

    public boolean addToPlayList(int songIndex, LinkedList<Song> playlist) {
        if (songIndex>=0 && songIndex<=this.songs.size()){
            System.out.println("Added song " + this.songs.get(songIndex).getName());
            playlist.add(this.songs.get(songIndex));
            return true;
        }return false;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playList){
        if (findSong(songName)!=null){
            System.out.println("Added song " + songName + " to the playlist ");
            playList.add(findSong(songName));
        } else {
            System.out.println("Did not found song " + songName + " in album");
        }return false;

    }


}