package arrayLab;
class Book {
    private String bookName;
    private String author;

    public Book() {}
    public Book(String bookName,String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void showInfo() {
        System.out.println("책의 이름 : " + bookName + " 책의 저자 : " + author);
    }
}


public class ClassArr {
    public static void main(String[] args) {

        Book[] bookArr = new Book[5];//초기화 하지 않으면 널! 0에 준하는 값

        for (int i=0; i< bookArr.length; i++) {
            System.out.println(bookArr[i]);
        }

        bookArr[0] = new Book("태백산맥1", "조정래");
        bookArr[1] = new Book("태백산맥2", "조정래");
        bookArr[2] = new Book("태백산맥3", "조정래");
        bookArr[3] = new Book("태백산맥4", "조정래");
        bookArr[4] = new Book("태백산맥5", "조정래");

        for (int i=0; i< bookArr.length; i++) {
            bookArr[i].showInfo();
        }
    }
}
