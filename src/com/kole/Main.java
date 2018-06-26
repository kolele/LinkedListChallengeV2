package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();


        Album rideTheLightning = new Album("RDL");
        rideTheLightning.addSongToAlbum("And justice for all", 12.22);
        rideTheLightning.addSongToAlbum("Kobas", 11.21);
        addToPlayList("prva",22, playList);
        addToPlayList("druga",22, playList);
        play(playList);
    }


    public static void addToPlayList(String songName, double songDuration, LinkedList<Song> playlist) {

        playlist.add(new Song(songName,songDuration));

    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Now playing " + listIterator.hasNext());
    }
}
