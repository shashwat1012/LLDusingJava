package CompositeDesignPattern.ProblemStatement;

import java.util.*;

public class Directory {
    
    String directoryName;
    List<Object> objectList;

    public Directory(String name) {
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for(Object obj: objectList) {
            if(obj instanceof File) {
                //typecasting it to inform the compiler to treat it is an object of file type
                //instanceof checks the type of the object at runtime
                ((File) obj).ls();
            } 
            else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }

}
