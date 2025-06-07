package org.aman.behavioral.iterator;

public class PlaylistIterator implements Iterator<String>{
    private final Playlist playlist;
    private int index;
    public PlaylistIterator( Playlist playlist) {
        this.playlist = playlist;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index<playlist.size();
    }

    @Override
    public String next() {
        return playlist.getSong(index++);
    }
}
