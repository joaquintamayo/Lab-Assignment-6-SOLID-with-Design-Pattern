public class Library {
    private Student student;
    private LibraryResource resource ;

    public Library(Student student, LibraryResource resource) {
        this.student = student;
        this.resource = resource;
    }

    public void process() {
        System.out.println("Student No: " + student.getStudNo());
        System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
        
        resource.borrow(student.getTitle());
    }
}