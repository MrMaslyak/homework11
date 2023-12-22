import java.util.ArrayList;

public class Library {


}
class Book{
    private String creator;
    private String name;
    private boolean avaible;
    private int create_years;

    public Book(String creator, String name, boolean avaible, int create_years) {
        this.creator = creator;
        this.name = name;
        this.avaible = avaible;
        this.create_years = create_years;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    public int getCreate_years() {
        return create_years;
    }

    public void setCreate_years(int create_years) {
        this.create_years = create_years;
    }
}
class User{
    private String name;
    private String address;
    private ArrayList<Book> books = new ArrayList();
    public void addBook(Book book) {
        if (book.isAvaible()) {
            book.setAvaible(false);
            books.add(book);
        } else {
            System.out.println("Book is not available");
        }
    }
    public void returnBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            book.setAvaible(true);
        } else {
            System.out.println("Book doesn’t belong to this user");
        }
    }
    public void printInfo() {
        System.out.println("Name: " +name);
        System.out.println("Address: " +address);
        System.out.println("Books:");

        books.forEach((book) -> {
            System.out.println("Title: " + book.getName());
            System.out.println("Author: " + book.getCreator());
            System.out.println("Year: " +book.getCreate_years());
        });
    }
    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}