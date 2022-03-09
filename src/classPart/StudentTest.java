package classPart;
//package는 소스의 묶음
//dao 데이터베이스와 연결하는
//유지보수에 대한 hierachy
//같은 이름의 클래스를 구별하기도 함 classPart.StudentTest
public class StudentTest {
    public static void main(String[] args) { //entry point : jvm이 호출함
        Student studentLee = new Student();
        studentLee.studentID = 202010891;
        studentLee.address = "서울시 영등포구 문래동";
        studentLee.grade = 5;
        studentLee.name = "이근희";

        studentLee.showStudentInfo();



    }
}
