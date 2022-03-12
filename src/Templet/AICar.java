package Templet;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("인공지능이 차를 운전합니다.");
        System.out.println("자동차가 스스로 방향을 전환합니다.");
    }

    @Override
    public void stop() {
        System.out.println("인공지능이 차를 멈춥니다.");
    }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 자동으로 와이퍼를 작동합니다.");
    }

    @Override
    public void washCar() {
        System.out.println("자동으로 세차합니다.");
    }

}
