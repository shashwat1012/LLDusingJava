package TemplateMethodPattern;

public class CSVParser extends ParserTemplate {
    @Override
    public void parseData(){
        System.out.println("Parsing Csv File");
    }
}
