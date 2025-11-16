package BuilderDesignPattern;

public class Client {
    
    public static void main(String[] args) {
        Director enggDirector = new Director(new EnggStudentBuilder());
        Director mbaDirector = new Director(new MBAStudentBuilder());

        Student enggStudent = enggDirector.createStudent();
        Student mbaStudent = mbaDirector.createStudent();

        System.out.println(enggStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
