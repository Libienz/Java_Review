package abstractLab;
//여기에서도 구현을 안하면 추상메소드로 남기고 하위 클래스에게 짬 때리면 됨
public class DeskTop extends Computer{


    public int typing(int a, int b) {

        return 0;
    }

    @Override
    public void typing() {
        System.out.println("dt typing");
    }

    @Override
    public int add(int x, int y) {
        return 0;
    }
}
