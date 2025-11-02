package ChainOfResponsibilityPattern;



public class LoggerDemo {
    
    public static void main(String[] args) {

        //Chain creation, to be done in reverse, since we need the next log processor for each logger
        LogProcessor fatalLogger = new FatalLogProcessor(4, null);
        LogProcessor errorLogger = new ErrorLogProcessor(3, fatalLogger);
        LogProcessor infoLogger = new InfoLogProcessor(2, errorLogger);
        LogProcessor logger = new DebugLogProcessor(1, infoLogger);

        //starting from the head of the chain
        
        logger.logMessage(LogProcessor.DEBUG, "debug message");
        logger.logMessage(LogProcessor.INFO, "info message");
        logger.logMessage(LogProcessor.ERROR, "error message");
        logger.logMessage(LogProcessor.FATAL, "fatal message");
    }
}
