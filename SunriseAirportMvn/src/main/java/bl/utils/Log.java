package bl.utils;

import org.apache.log4j.Logger;

/**
 * Created by andrew on 13.07.17.
 * <p>
 * Writing logs until application working. Creating new log per run.
 */

public class Log {

    private final static Logger instance = Logger.getLogger(Log.class.getName());

    private Log() {
    }

    public static Logger getInstance() {

        return instance;
    }


}
