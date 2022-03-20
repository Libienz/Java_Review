package collectionFrameWork.arrayList;

import collectionFrameWork.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arr;

    public MemberArrayList() {
         arr = new ArrayList<Member>();
    }

    public void addMember(Member member){
        arr.add(member);
    }

    public boolean removeMember(int memberID) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMemberID() == memberID) {
                arr.remove(i);
                return true;
            }
        }
        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member m : arr) {
            System.out.println(m);
        }
    }

}
