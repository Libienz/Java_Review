package programingBasicOnJava;// 음수를 만드는 법 2의 보수를 취한다!
// MSB가 1인 경우 음수!
// 2의 보수 더해서 10 을 만들어서 앞의 한자리를 날리는!10 + 10 = 100 but 1 trunkate
// 그래서 1의 보수를 취하고 더하면 전부 1111111111111이 되는데 거기다 1을 더하면 0000000000

public class Binary {
    public static void main(String[] args) {

        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int hNum = 0XA;

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);

    }
}
