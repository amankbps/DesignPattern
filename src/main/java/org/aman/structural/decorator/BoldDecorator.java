package org.aman.structural.decorator;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(TextView decorator) {
        super(decorator);
    }
    @Override
    public void render() {
        System.out.print("<b>");
        textView.render();
        System.out.print("</b>");
    }
}
