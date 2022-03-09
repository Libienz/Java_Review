package classPart.about_static;

public class Student {
    public Student() {
        this.studentID = serialNum;
        serialNum++;
    }
    static int serialNum  = 10000;
    int studentID;
    String studentName;

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        //studentName = "홍길동";
        return serialNum;
    }
}

