package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLoggerConfig {
    private String rootLoggerLevel;
    private String printedLoggerLevel;

    public void setRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel) {
        this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger() {
        Level rootLoggingLevel = Level.parse(rootLoggerLevel);
        Level printedLoggingLevel = Level.parse(printedLoggerLevel);

        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        Logger loggerParent = applicationContextLogger.getParent();

        loggerParent.setLevel(rootLoggingLevel);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLoggingLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        loggerParent.addHandler(consoleHandler);
    }
}
