package com.sparta.idg.pizzastore259.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return " [" + record.getLevel()
                + "] -> " + record.getMessage()
                + "\n";
    }
}
