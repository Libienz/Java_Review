package Templet;

public abstract class Car {

    public abstract void drive();
    public abstract void stop(); //차를 운전하고 멈추는 것은 어떤 차냐에 따라 다르다
    public abstract void wiper();
    public void washCar() {} //추상 메소드는 아님 구현이 된것! 후크메소드!?
    //차이점은 구현을 피하면서 필요할 때 재정의를 할 수 있음
    //final을 클래스에 붙이면 더 이상 상속되지 않음

    public void startCar() {
        System.out.println("시동을 켭니다");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run() { // 하위클래스에서 재정의를 하려고 하면 오류가 남
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff(); //항상 똑같은 일련의 시나리오오 final을 붙여서 수정불가능하게 하는것이
                   //템플릿 메서드!

   }
}
