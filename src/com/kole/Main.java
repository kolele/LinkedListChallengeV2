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
        rideTheLightning.addToPlayList("Kobas", playList);
        rideTheLightning.addToPlayList("And justice for all", playList);
        rideTheLightning.addToPlayList("leburda", playList);
        play(playList);
    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        System.out.println("Now playing " + listIterator.next().toString());
    }
}