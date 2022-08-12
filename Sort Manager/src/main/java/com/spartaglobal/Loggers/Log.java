package com.spartaglobal.Loggers;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    public static final Logger logger = Logger.getLogger("my logger");

    public static void main(String[] args) {

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new CustomFormatter());

        logger.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.log(Level.INFO, "This is a info log test");
        logger.log(Level.WARNING, "This is a Warning log test");
        logger.log(Level.FINE, "This is a FINE log test");

    }
}
