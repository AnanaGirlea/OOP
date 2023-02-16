package lab13.task4;

import java.util.EnumSet;

public class FileLogger extends LoggerBase{

    public FileLogger(EnumSet<LogLevel> levels) {
        super(levels);
    }

    @Override
    public void writeMessage(String text) {
        System.out.println("[File] " + text);
    }
}
