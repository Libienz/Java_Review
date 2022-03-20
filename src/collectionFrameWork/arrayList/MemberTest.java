package collectionFrameWork.arrayList;

import collectionFrameWork.Member;

public class MemberTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member("이순신");
        Member memberKim = new Member("김유신");
        Member memberShin = new Member("신사임당");


        //System.out.println(memberArrayList); 원소 하나하나의 toString이 출력된다.
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);

        memberArrayList.showAll();

        memberArrayList.removeMember(memberKim.getMemberID());

        memberArrayList.showAll();


    }
}
