package classPart.cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take (int money) {
        this.money += money;
        passengerCount++;
    }

    public void showInfo() {
        System.out.printf("지하철 %d노선의 승객은 %d명 이고 수입은 %d 입니다.",lineNumber,
                passengerCount, money);
    }
}
