package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        Mynumber maxNum = (x,y) -> x >= y?x:y; //이게 람다식
        int max = maxNum.getMaxnumber(10,20);
        System.out.println(max);

    }
}
