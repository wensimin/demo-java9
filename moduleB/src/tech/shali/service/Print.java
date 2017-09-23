package tech.shali.service;

import java.util.logging.Logger;

public class Print {
    public static void print(String msg){
        Logger logger = Logger.getLogger("a");
        logger.info(msg);
    }
}
