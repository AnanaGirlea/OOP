package lab7.task1;

import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.document.UrlSegment;

public interface DocumentVisitor {
    public void visit(ItalicTextSegment text);
    public void visit(BoldTextSegment text);
    public void visit(UrlSegment text);
    public void visit(PlainTextSegment text);

    public StringBuilder getDocument();
}
