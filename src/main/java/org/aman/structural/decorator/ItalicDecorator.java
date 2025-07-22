package org.aman.structural.decorator;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextView decorator) {
        super(decorator);
    }
    @Override
    public void render() {
        System.out.print("<i>");
        textView.render();
        System.out.print("</i>");
    }
}
