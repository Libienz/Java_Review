package classPart.about_static;
// static 같은 클래스의 객체를 여러개 만들어 낼 때
// 공유하고자 하는 정적 데이터를 인스턴스 안이 아닌 공간을 주어 공유할 수 있도록 하는!
// 힙에 생성되지 않기 때문에 free되지 않음 data 혹은 다른 정적 공간에..
// 얘는 new할 때 할당 받는 것이 아니라 전체 프로그래밍이 로드 될때 상수 또는 리터럴등과 함께
// 클래스 변수라고도 함
// 인스턴스 만들지 않고 쓰고싶을때도 사용
// 스태틱 메소드도 비슷한 결
// 스태틱 메소드에서 인스턴스 변수 즉 일반 멤버 변수나 함수를 이용할 수 없음
// 생성되는 시기의 차이 때문
public class Static {
    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.getStudentID());

        Student studentT = new Student();
        System.out.println(studentT.getStudentID());


        Student.serialNum++;

        Student studentK = new Student();
        System.out.println(studentK.studentID);
    }

}
