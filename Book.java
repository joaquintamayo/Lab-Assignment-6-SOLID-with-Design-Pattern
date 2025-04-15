public class Book implements LibraryResource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowed Book: " + title + "\n");
    }
}
