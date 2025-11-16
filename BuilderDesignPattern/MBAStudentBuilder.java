package BuilderDesignPattern;

import java.util.*;

public class MBAStudentBuilder extends StudentBuilder{
    
    @Override
    public StudentBuilder setSubjects() {
        List<String>subs = new ArrayList<>();
        subs.add("Marketing");
        subs.add("Finance");
        subs.add("Accounting");
        this.subjects = subs;
        return this;
    }
}
