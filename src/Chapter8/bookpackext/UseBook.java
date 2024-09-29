package Chapter8.bookpackext;

import Chapter8.bookpack.*;

public class UseBook {
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

// 如果要导入包的全部内容 -> 可用*代替类名