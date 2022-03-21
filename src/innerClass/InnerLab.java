package innerClass;

class OutClass {
    int num = 10;
    private static int sNum = 20;
    public InClass inClass;

    public OutClass (){
        inClass = new InClass();
    }
    class InClass { // 인스턴스 이너클래스

        int inNum = 200;

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

    }

    static class StaticInnerClass { //스태틱 이너클래스 같은 경우는 생성없이 접근가능
        static int num = 10;
        public static void inTest() {
            System.out.println(num);
        }
    }
}
public class InnerLab {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.inClass.inTest();

        OutClass.StaticInnerClass.inTest();
    }
}
