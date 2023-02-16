package lab7.task1.document;

import lab7.task1.DocumentVisitor;

public class UrlSegment extends TextSegment{
    public String s;

    public UrlSegment(String content, String s) {
        super(content);
        this.s = s;
    }


    @Override
    public void accept(DocumentVisitor v) {
        v.visit(this);
    }
}
