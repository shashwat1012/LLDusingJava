package BuilderDesignPattern;

import java.util.*;

public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    List<String>subjects;

    //all the intermediate setter functions will return objects of type studentBuilder since we have not built the final object yet
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }
    
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    //setting this as abstract as different builders extending this class will have custom implementations for setting subjects
    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
    
}
