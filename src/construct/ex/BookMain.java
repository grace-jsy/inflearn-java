package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // default constructor
        Book book1 = new Book();
        book1.displayInfo();

        // constructor with title and author
        Book book2 = new Book("Hello Java", "Grace");
        book2.displayInfo();

        // constructor with all fields
        Book book3 = new Book("Hello Java", "Grace", 722);
        book3.displayInfo();
    }
}
