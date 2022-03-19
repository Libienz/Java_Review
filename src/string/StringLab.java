package string;

public class StringLab {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2); //false

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4); // true

        //상수풀을 가르키게 되면 같다. 모든 래퍼클래스에서 이 같은 방식식
        //한번 생성된 String 값(문자열)은 불변 concat해도 바뀌는게 아니라
        //새로운 메모리 가리키게 된다.





    }
}
