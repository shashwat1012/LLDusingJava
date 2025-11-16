package BuilderDesignPattern;

import java.util.*;

public class EnggStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String>subs = new ArrayList<>();
        subs.add("Data Structures");
        subs.add("Optimization");
        subs.add("Numerical methods");
        this.subjects = subs;
        return this;
    }
}
