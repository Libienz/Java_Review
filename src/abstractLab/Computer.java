package abstractLab;
//하위클래스에서 구현
public abstract class Computer {
    public void display() {}; //이렇게만 써도 구현부가 있는거
    public abstract void typing();

    public abstract int add(int x, int y);
    public void turnOn() {
        System.out.println("전원을 켭니다");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
