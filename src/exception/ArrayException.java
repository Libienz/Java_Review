package exception;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e); //exception의 투스트링이 불린 것
        }
        finally { //트라이가 실행되면 무조건 같이 실행되는 블락
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
