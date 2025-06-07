package org.aman.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IterableCollection<String>{

    private final List<String> songs = new ArrayList<>();

    public void addSong(String song) {
        songs.add(song);
    }

    public String getSong(int index) {
        return songs.get(index);
    }
    public int size() {
        return songs.size();
    }
    @Override
    public Iterator<String> createIterator() {
        return new PlaylistIterator(this);
    }
}
