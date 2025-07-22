package org.aman.structural.decorator;

public class Main {
    public static void main(String[] args) {

         TextView view=new PlainTextView("Hi Aman");
         view.render();
        System.out.println();
         //bold
        TextView boldView=new BoldDecorator(view);
        boldView.render();
        System.out.println();
        //bold+italic
        TextView boldItalic=new BoldDecorator(new ItalicDecorator(view));
        boldItalic.render();

        //underline+bold+italic
        System.out.println();
        TextView underlineBoldItalic=new UnderlineDecorator(boldItalic);
        underlineBoldItalic.render();

    }
}
