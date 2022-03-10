package arrayLab;

public class Array {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        int numbers1[] = new int[10];
        int[] numbers2 = new int[] {0,1,2};
        int[] numbers3 = {0,1,2};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //초기화 되지 않은 번지
        //int -> 0 double 0.0 class null
        for (int i=0; i<numbers.length; i++) {

            //System.out.println(numbers.length);
            System.out.println(numbers[i]);
        }



    }

}
