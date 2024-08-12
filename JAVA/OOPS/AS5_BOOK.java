class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", "123456789");
        book.display();
    }
}
