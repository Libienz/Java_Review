package classPart.class_basic;

public class Student { // 퍼블릭 클래스와 자바 파일의 이름은 같아야 함 여러개의
                       // 여러개의 클래스 한 파일 안에 선언할 수 있지만 퍼블릭은 하나
                       // 모든 자바의 코드는 클래스 안에
                        // 멤버 변수 properties


    //오호라 안드로이드 자체가 거대한 프레임워크다.
    int studentID;
    String name; // String jdk에서 제공하는 클래스 문자열
    String address;
    int grade;

    public Student(){} //동일한 이름을 가신 메소드 또는 생성자가 헤더 부분이
    //헤더 부분이 다르다는 특징으로 어느 메소드를 사용할지 찾아가는 것이 오버로딩!!
    public Student(int id, String name) {

        this.name = name;
        setName(name);
        this.studentID = id;
    } //생성자가 없는 경우 자바 컴파일러가 디폴트를 하나 넣어줌
    //프리 컴파일 단계에서 내가 객체를 생성하면서 해야 할 일들을 처리
    //생성자는 상속되지 않는다!?

    //변수의 자료형은 기본 자료형과 참조자료형으로
    // 참조 자료형의 경우에는 jdk에서 제공되는 것들도 있고 사용자가 직접 정의 할 수도 있음음


   public void showStudentInfo() {
        System.out.printf("학생이름 : %s\n학생 주소 : %s\nID : %d\n성적 : %d\n",
                name, address, studentID, grade);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) { //entry point : jvm이 호출함
        Student studentLee = new Student(); // new는 생성자 studentLee는 참조변수!
        //studentLee가 힙메모리에 생성
        //studentLee.을 이용해서 참조할 수 있는 것 열람 가능
        studentLee.name = "이근희";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도";
        studentLee.grade = 5;


        Student studentKim = new Student();
        studentKim.name = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "서울시 영등포구 당산동";
        studentKim.grade = 4;

        studentKim.showStudentInfo();
        studentLee.showStudentInfo();

        System.out.println(studentKim); //참조변수는 스택에 저장 실제 인스턴스는 힙메모리에!
        //heap 영역에 있는 인스턴스는 자바에선 가비지 콜렉팅을 해줌 시플플은 명시적으로 지워야함


        //기본 자료형과 참조형 데이터 타입 구분

        // 접근제어자 default 아무것도 안썻을 경우에는 패키지 private
        // public 은 다 오픈
        // private은 같은 파일이어도 클래스내에서만 사용가능
        // protected 는 상속관계에서

        // package는 소스의 묶음
//dao 데이터베이스와 연결하는
//유지보수에 대한 hierachy
//같은 이름의 클래스를 구별하기도 함 classPart.StudentTest
    }
}
