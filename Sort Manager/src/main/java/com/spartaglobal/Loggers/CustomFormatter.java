package com.spartaglobal.Loggers;


import java.time.LocalDate;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {

        if(record.getLevel().equals(Level.WARNING)){
            return LocalDate.now()
                    + " " + record.getLoggerName()
                    + " " + record.getLevel()
                    + " " + record.getMessage()
                    + "\n";
        } else {
            return record.getLevel()
                    + " " + record.getMessage()
                    + "\n";
        }

    }
}
