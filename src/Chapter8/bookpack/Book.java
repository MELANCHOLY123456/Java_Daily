package Chapter8.bookpack;

public class Book {
    protected String title;
    protected String author;
    protected int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide",
                "Schildt", 2018);
        books[1] = new Book("Java: The Complete Reference",
                "Schildt", 2018);
        books[2] = new Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new Book("On the Road",
                "Kerouac", 1955);

        for (Book book : books) {
            book.show();
        }
    }
}
