package BuilderDesignPattern;

public class Director {
    
    StudentBuilder studentBuilder;
    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EnggStudentBuilder) {
            return createEnggStudent();
        } else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEnggStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("Shivam").setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(23).setRollNumber(2).setName("Shashwat").setSubjects().build();
    }
}
