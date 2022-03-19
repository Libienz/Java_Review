package objectlab;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String toString() {
        return title + "," + author;
    }
}
public class ToStringLab {
    public static void main (String[] args) {

        Book book = new Book("두잇자바", "은종");
        //object의 원형은 패키지이름.클래스.해시코드(16진수 주소)
        System.out.println(book);

        String str = new String("test"); //스트링 클래스에 toString 재정의 되어있음
        System.out.println(str);
    }

}
