public class Book {
    private String title, author, ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', ISBN='%s'}", title, author, ISBN);
    }
}
