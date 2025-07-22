package org.aman.structural.decorator;

public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextView decorator) {
        super(decorator);

    }

    @Override
    public void render() {
        System.out.print("<u>");
        textView.render();
        System.out.print("</u>");
    }
}
