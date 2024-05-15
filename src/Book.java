public class Book implements LibraryResource {
    private String title;
    private String resourceId;

    public Book(String title, String resourceId) {
        this.title = title;
        this.resourceId = resourceId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getResourceId() {
        return resourceId;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing book: " + title + " (ID: " + resourceId + ")");
    }
}