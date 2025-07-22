package org.aman.structural.decorator;

public class PlainTextView implements TextView{
    private final String text;

    public PlainTextView(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.print(this.text);
    }
}
