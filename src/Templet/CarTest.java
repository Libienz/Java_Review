package Templet;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new ManualCar();
        myCar.run();

        System.out.println("");
        Car yourCar = new AICar();
        yourCar.run();
        //매뉴얼 카와 인공지능자동차 모두 시나리오는 동일 운전방법은 상이
        //시나리오는 바뀌면 안된다! final을 run메소드에 부여

    }
}
