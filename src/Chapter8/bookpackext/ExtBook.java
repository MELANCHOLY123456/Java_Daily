package Chapter8.bookpackext;

import java.util.Objects;

public class ExtBook extends Chapter8.bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    /*
     * 子类可以访问Book的成员
     * */
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int d) {
        pubDate = d;
    }
}

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];
        books[0] = new ExtBook("Java: A Beginner's Guide",
                "Schildt", 2018, "Oracle Press");
        books[1] = new ExtBook("Java: The Complete Reference",
                "Schildt", 2018, "Oracle Press");
        books[2] = new ExtBook("Introducing JavaFX 8 Programming",
                "Schildt", 2015,
                "Oracle Press");
        books[3] = new ExtBook("Red Storm Rising",
                "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road",
                "Kerouac", 1955, "Viking");

        for (ExtBook book : books) {
            book.show();
        }

        // Find books by author
        System.out.println("Showing all books by Schildt.");
        for (ExtBook book : books)
            if (Objects.equals(book.getAuthor(), "Schildt"))
                System.out.println(book.getTitle());

        /*
         * 非子类不允许访问protected域
         * */
        // books[0].title = "test title"; // Error -- not accessible
    }
}
