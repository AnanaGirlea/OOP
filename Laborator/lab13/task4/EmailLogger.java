package lab13.task4;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase{

    public EmailLogger(EnumSet<LogLevel> levels) {
        super(levels);
    }

    @Override
    public void writeMessage(String text) {
        System.out.println("[Email] " + text);
    }
}
