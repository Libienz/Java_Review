package arrayLab;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];


        bookArray1[0] = new Book("태백산맥1","조정래");
        bookArray1[1] = new Book("태백산맥2","조정래");
        bookArray1[2] = new Book("태백산맥3","조정래");

        //System.arraycopy(bookArray1,0,bookArray2,0,3);

        /*for (int i = 0; i< bookArray2.length; i++) {
            bookArray2[i].showInfo();
        }
        //복사 성공적 bookArray1 -> bookArray2

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        for (int i = 0; i< bookArray1.length; i++) {
            bookArray1[i].showInfo();
        }
        for (int i = 0; i< bookArray2.length; i++) {
            bookArray2[i].showInfo();
        } */

        //1만 바꿧는데 2도 바뀐다!? 같은 곳 가리키기 때문에 얕은 복사 일어났다.

        //깊은 복사는 인스턴스를 다시 생성해야 함!


        for (int i = 0; i< bookArray1.length; i++) {
            bookArray2[i] = new Book();
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        for (int i = 0; i< bookArray1.length; i++) {
            bookArray1[i].showInfo();
        }
        for (int i = 0; i< bookArray2.length; i++) {
            bookArray2[i].showInfo();
        }

        for (Book i: bookArray1) { //enhanced for 배열에서 i로 각 원소를 받아와서
            i.showInfo();
        }
    }
}
