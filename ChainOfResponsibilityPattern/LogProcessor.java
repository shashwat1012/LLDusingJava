package ChainOfResponsibilityPattern;

public abstract class LogProcessor {
    
    //marking the variables as static and final, since the ownership of these variables should rest with the class, not its instances, shared instance across all, also the level values shouldnt change
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;
    public static final int FATAL = 4;
    int level;

    LogProcessor nextLogProcessor;

    public void logMessage(int level,String message) {
        if(this.level == level) {
            write(message);
        }
        //pass to the next handler in chain
        if(this.nextLogProcessor != null) {
            this.nextLogProcessor.logMessage(level, message);
        }
    }
    //marking this as abstract protected, since i want only the subclasses to access and provide a concrete implementation of this function
    abstract protected void write(String message);
}
