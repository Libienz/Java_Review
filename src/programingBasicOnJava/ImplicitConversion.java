package programingBasicOnJava;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        System.out.println(num);

        long lNum = 10L;
        float fNum = lNum;

        System.out.println(lNum);
    }
}
