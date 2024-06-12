package com.mycompany.app;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HolaMundo {
    private static final Logger logger = LogManager.getLogger(HolaMundo.class);

    public static void main(String[] args) {
        logger.debug("Hola Mundo");
    }
}
