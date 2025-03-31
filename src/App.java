public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        // Вывод информации
        System.out.println(book1.getTitle() + " — " +
                book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + ", " +
                book1.getPublicationYear() + " год");

        System.out.println(book2.getTitle() + " — " +
                book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + ", " +
                book2.getPublicationYear() + " год");

        // Изменение года публикации
        book1.setPublicationYear(1873);
        System.out.println("Обновлённый год публикации книги \"" + book1.getTitle() + "\": " + book1.getPublicationYear());
    }
}

