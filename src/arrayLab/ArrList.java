package arrayLab;

import java.util.ArrayList;

/* add("aaa");
   size();
   get(index);
   remove(index);
   isEmpty();
 */
public class ArrList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        //제너릭 명시하지 않으면 오브젝트로 이해한다!?
        //제너릭 쓰는게 일반적!?


        System.out.println(arr.size());
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");


        for (String s : arr) { //향상된 for문과 사용가능
            System.out.println(s);
        }


        for (int i = 0; i<arr.size(); i++) {
            System.out.println(arr.get(i)); //인덱스연산은 어레이리스트 클래스에선 제공x
        }

    }



}
