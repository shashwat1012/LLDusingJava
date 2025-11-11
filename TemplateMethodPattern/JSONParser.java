package TemplateMethodPattern;

public class JSONParser extends ParserTemplate {
    @Override
    public void parseData(){
        System.out.println("Parsing JSON File");
    }
}
