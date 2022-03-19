package string;
class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ClassTest {
    public static void main(String[] args) {

        //String str = new String("abc");

        Person person = new Person();

        Class pClass1 = person.getClass(); //getClass는 오브젝트의 메소드 Class class반환
        Class pClass2 = Person.class;

    }
}
