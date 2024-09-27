package com.fawry.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    private static MyLogger instance;
    private static Logger logger;
    private static FileHandler fileHandler;

    private MyLogger() {
        try {
            logger = Logger.getLogger(MyLogger.class.getName());
            fileHandler = new FileHandler("app.log", true); // true for append mode
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            synchronized (MyLogger.class) {
                if (instance == null) {
                    instance = new MyLogger();
                }
            }
        }
        return instance;
    }

    public void logInfo(String message) {
        logger.info(message);
    }

    public void logWarning(String message) {
        logger.warning(message);
    }

}