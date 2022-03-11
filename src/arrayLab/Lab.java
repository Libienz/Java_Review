package arrayLab;

import java.util.ArrayList;

class Subject {
    private String name;
    private int scorePoint;

    public int getScorePoint() {
        return scorePoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}

class Student {
    private int studentID;
    private static int new_id = 1000;
    private String studentName;
    private ArrayList<Subject> subjList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjList = new ArrayList<Subject>();
    }

    public Student(String studentName) {
        this.studentID = new_id++;
        this.studentName = studentName;

        subjList = new ArrayList<Subject>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(Subject subj) {
        this.subjList.add(subj);
    }
    //addSubject 오버로딩
    public void addSubject(String name, int score) {
        Subject subj = new Subject();
        subj.setName(name);
        subj.setScorePoint(score);
        this.subjList.add(subj);
    }

    public void showStudentInfo() {
        System.out.println("학생이름 : " + studentName);
        System.out.println("학번 : " + studentID);
        int total = 0; //총점
        for (Subject s: subjList) {
            total += s.getScorePoint();
            System.out.printf("과목 : %s\n점수 : %d\n", s.getName(), s.getScorePoint());
        }

        System.out.println("총점 : " + total);

    }
}
public class Lab {
    public static void main(String[] args) {

        Student st_lee = new Student("lee");
        st_lee.addSubject("국어",100);
        st_lee.addSubject("수학",90);

        st_lee.showStudentInfo();

        Student st_kim = new Student("Kim");
        st_kim.addSubject("국어", 90);
        st_kim.addSubject("수학", 100);

        st_kim.showStudentInfo();

    }
}
