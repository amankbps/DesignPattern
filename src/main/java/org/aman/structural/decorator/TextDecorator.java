package org.aman.structural.decorator;

public abstract class TextDecorator implements TextView{
    protected TextView textView;
    public TextDecorator(TextView textView) {
        this.textView = textView;
    }
}
