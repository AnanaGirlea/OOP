package lab7.task1;

import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.document.UrlSegment;

public class Markdown implements DocumentVisitor{
    public StringBuilder text2 = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment text) {
        text2.append("_");
        text2.append(text.getContent());
        text2.append("_");
    }

    @Override
    public void visit(BoldTextSegment text) {
        text2.append("__");
        text2.append(text.getContent());
        text2.append("__");
    }

    @Override
    public void visit(UrlSegment text) {
        text2.append("[");
        text2.append(text.s);
        text2.append("]");
        text2.append("(");
        text2.append(text.getContent());
        text2.append(")");
    }

    @Override
    public void visit(PlainTextSegment text) {
        text2.append(text.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return text2;
    }
}
