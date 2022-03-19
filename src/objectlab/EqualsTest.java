package objectlab;

import java.util.Objects;

class Student {
    int studentID;
    String studentName;

    Student(int tudentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student std = (Student)o;
            if (studentID == std.studentID) {
                return true;
            }
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() { //자바에서는 equals가 같으면 해쉬값도 같게 해야
        //다른 클래스 사용할 때 오류가능성 줄일 수 있음
        return studentID;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2); //false 주소가 달라
        System.out.println(str1.equals(str2)); //true 내용이 같아

        Student std1 = new Student(10001,"Tomas");
        Student std2 = new Student(10001,"Tomas");

        System.out.println(std1 == std2); //false 주소달라
        System.out.println(std1.equals(std2)); // 재정의한 equals

        System.out.println(std1.hashCode()); //jvm이 힙 메모리에 인스턴스를
        //저장하는 방식이 해쉬방식 주소반환 10진수
        System.out.println(std2.hashCode());

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        //얘네들은 왜같냐면 String에 해쉬코드가 재정의  되어 있기 떄문
        //identifyHashCode메소드 이용해서 알아볼 수 있음음
        //논리적으로 동일함을 위해 썻다면 해쉬코드도 논리적 동일할때 물리적 값이 같도록
        //반환하도록 만듬


    }}
