package lab7.task1;

import lab7.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator{

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments - DONE
        Dokuwiki dokuwiki = new Dokuwiki();
        for(TextSegment textSegment : textSegments)
            textSegment.accept(dokuwiki);
        return dokuwiki.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments - DONE
        Markdown markdown = new Markdown();
        for(TextSegment textSegment : textSegments)
            textSegment.accept(markdown);
        return markdown.getDocument();
    }
}
