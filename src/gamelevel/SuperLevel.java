package gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 점프");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 돈다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****슈퍼 레벨입니다.*****");
    }
}
