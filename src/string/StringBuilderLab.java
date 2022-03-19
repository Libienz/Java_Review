package string;

public class StringBuilderLab {

    public static void main(String[] args) {
        String str1 = new String("JAva");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer));

        //String 같은 경우는 새로운 문자를 덧붙여도 새로운 주소로 계속 바뀌는데 버퍼는 그렇지 않네

        String str2 = buffer.toString(); //buffer.toString 으로 문자열 가져올 수 있음



    }
}
