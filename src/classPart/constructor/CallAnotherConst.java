package classPart.constructor;
class Person{
    String name;
    int age;
    public Person() {
        //int i = 0; this를 다른 생성자에서 쓸 경우 앞에 아무런 스테이트먼트 들어오면 안됨
        //생성하려고 들어갔는데 다른 기록이 있으면 이상함
        this("이름없음", 1);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person returnSelf() {
        return this;
    }
}
public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);

        System.out.println(p1.returnSelf());
        System.out.println(p1);

    }
}
