package lab13.task4;

import java.util.EnumSet;

public abstract class LoggerBase {
    protected EnumSet<LogLevel> levels;
    protected LoggerBase next;
    protected String text;

    public LoggerBase(EnumSet<LogLevel> levels) {
        this.levels = levels;
    }

    public void setNext(LoggerBase next) {
        this.next = next;
    }

    public abstract void writeMessage(String text);

    public void message(String text, LogLevel level) {

        if (levels.contains(level))
            writeMessage(text);

        if (next != null)
            next.message(text, level);
    }
}
