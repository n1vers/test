package ee.ivkhkdev;

public class App {
    public void run() {

        Author author1 = new Author("Джордж", "Оруэлл");
        Author author2 = new Author("Фрэнсис", "Фицджеральд");
        Author author3 = new Author("Харпер", "Ли");
        Author author4 = new Author("Михаил", "Булгаков");
        Author author5 = new Author("Дж. Р. Р.", "Толкин");


        Book[] books = new Book[5];
        books[0] = new Book("1984", new Author[]{author1});
        books[1] = new Book("Великий Гэтсби", new Author[]{author2});
        books[2] = new Book("Убить пересмешника", new Author[]{author3});
        books[3] = new Book("Мастер и Маргарита", new Author[]{author4});
        books[4] = new Book("Властелин колец", new Author[]{author5});

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
