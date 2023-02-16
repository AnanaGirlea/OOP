package lab2.task4;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\n title: " + title +
                "\n author: " + author +
                "\n year of publication: " + year;
    }
}