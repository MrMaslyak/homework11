public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", "Author 1", true, 2019);
        Book book2 = new Book("Book 2", "Author 2", true,  2022);
        Book book3 = new Book("Book 3", "Author 3", true, 2021);
        User user1 = new User("user 1", "address 1");
        User user2 = new User("user 2", "address 2");

        user1.addBook(book1);
        user2.addBook(book2);
        user1.addBook(book2);
        user2.returnBook(book2);
        user2.addBook(book2);
        user1.printInfo();
        user2.printInfo();

    }
}