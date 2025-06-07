package org.aman.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Shape of you");
        playlist.addSong("Naina");
        playlist.addSong("Tum hi ho");
        playlist.addSong("yeh kya hua");

        Iterator<String>iterator= playlist.createIterator();
        System.out.println("Now playing");
        while(iterator.hasNext()){
            System.out.println("♫ "+iterator.next());
        }
    }
}
