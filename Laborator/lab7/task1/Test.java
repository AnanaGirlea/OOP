package lab7.task1;


import lab7.task1.document.TextSegment;
import lab7.task1.document.ItalicTextSegment;
import lab7.task1.document.BoldTextSegment;
import lab7.task1.document.UrlSegment;
import lab7.task1.document.PlainTextSegment;
import lab7.task1.DocumentVisitor;
import lab7.task1.Dokuwiki;
import lab7.task1.Markdown;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<TextSegment> textSegments = getTextSegments();

        WikiGenerator generator = new WikiGenerator(textSegments);

        System.out.println("----------------------Dokuwiki----------------------");
        System.out.println(generator.getDokuWikiDocument());
        System.out.println("---------------------MardownWiki--------------------");
        System.out.println(generator.getMarkdownDocument());

        // TODO __AFTER__ the main functionality is working correctly - DONE
        // See what happens if the TextSegment's accept method is not abstract and the subclasses do not override it
        //  - testing this needs changes in the visitor interface as well
    }
    public static List<TextSegment> getTextSegments() {
        List<TextSegment> textSegments = new ArrayList<>();

        // TODO uncomment this after implementing all the TextSegment subclasses - DONE
        textSegments.add(new PlainTextSegment("Mecanismul din spatele pattern-ului "));
        textSegments.add(new ItalicTextSegment("Visitor"));
        textSegments.add(new PlainTextSegment(" poartă numele de "));
        textSegments.add(new BoldTextSegment("double-dispatch"));
        textSegments.add(new PlainTextSegment(".\n"));
        textSegments.add(new UrlSegment("http://elf.cs.pub.ro/poo/laboratoare/tutorial-doubledispatch",
                "Tutorialul de double-dispatch"));
        textSegments.add(new PlainTextSegment(" oferă mai multe detalii legate de acest mecanism.\n"));
        textSegments.add(new PlainTextSegment("Pattern-ul "));
        textSegments.add(new BoldTextSegment("Visitor"));
        textSegments.add(new PlainTextSegment(" este util când se doreşte prelucrarea unei "));
        textSegments.add(new ItalicTextSegment("structuri complexe"));
        textSegments.add(new PlainTextSegment(", ce cuprinde mai multe "));
        textSegments.add(new ItalicTextSegment("obiecte de tipuri diferite"));
        textSegments.add(new PlainTextSegment(".\n"));

        return textSegments;
    }
}
