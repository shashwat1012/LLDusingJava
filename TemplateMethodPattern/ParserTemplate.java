package TemplateMethodPattern;

public abstract class ParserTemplate {

    public void parse(){
        open();
        parseData();
        close();
    }

    public void open(){
        System.out.println("Opening File");
    }

    public void close(){
        System.out.println("Closing File");
    }

    protected abstract void parseData();
}
