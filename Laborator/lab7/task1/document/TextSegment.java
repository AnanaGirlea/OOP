package lab7.task1.document;

import lab7.task1.DocumentVisitor;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment{
    private String content;

    TextSegment(String content) {this.content = content;}

    public String getContent() {
        return content;
    }

    // TODO add method for applying the visitor - DONE

    public abstract void accept(DocumentVisitor v);

}
