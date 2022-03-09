package programingBasicOnJava;

public class Loop {

    public static void main(String[] args) {
        int num = 1;
        int res = 0;
        while (num <= 10) {
            res += num;
            num++;
        }

        System.out.printf("%d\n", res);
        res = 0;

        for (int i = 0; i <= 10; i++) {
            res += i;
        }
        System.out.printf("%d\n", res);

        for (int i=2; i<=9; i++ ) {
            if (i % 2 == 1) {
                continue;
            }
            for (int j = 1; j<=9; j++) {
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }


    }

}
