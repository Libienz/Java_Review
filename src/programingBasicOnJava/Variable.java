package programingBasicOnJava;

public class Variable {
   public static void main(String[] args) {
       int num; //선언
       num = 19; //초기화 19는 리터럴

       //long num = 123456789000; 리터럴은 보통 4바이트로 어딘가에 있음
       long num2 = 123456789000L;

       System.out.println(num);

       double dNum = 3.14;
       System.out.println(dNum = (int)dNum);
       System.out.println(dNum);

   }


}
