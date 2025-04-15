public class Journal implements LibraryResource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowed Journal: " + title + "\n");
    }
}