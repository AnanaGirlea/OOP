package lab13.task4;

import java.util.EnumSet;

public class ConsoleLogger extends LoggerBase{

    public ConsoleLogger(EnumSet<LogLevel> levels) {
        super(levels);
    }

    @Override
    public void writeMessage(String text) {
        System.out.println("[Console] " + text);
    }
}
