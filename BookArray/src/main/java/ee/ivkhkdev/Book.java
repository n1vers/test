package ee.ivkhkdev;

import java.util.Arrays;

public class Book {
    private String title;
    private Author[] authors;


    public Book(String title, Author[] authors) {
        this.title = title;
        setAuthors(authors); // Используем setter для валидации
    }


    public String getTitle() {
        return title;
    }

    public Author[] getAuthors() {
        return authors;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthors(Author[] authors) {

        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("Книга должна иметь хотя бы одного автора");
        }
        this.authors = authors;
    }


    @Override
    public String toString() {
        return "Книга: " + title + ", Авторы: " + Arrays.toString(authors);
    }
}
