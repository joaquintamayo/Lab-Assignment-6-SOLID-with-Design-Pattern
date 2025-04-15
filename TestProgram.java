public class TestProgram {
    public static void main(String[] args) {

        Student studentOne = new Student("123", "Starkey", "Drew", "Queer");
        Library resource1 = new Library(studentOne, new Book());
        resource1.process();

        Student studentTwo = new Student("456", "Chalamet", "Timothée", "Call Me By Your Name");
        Library resource2 = new Library(studentTwo, new Journal());
        resource2.process();

    }
}