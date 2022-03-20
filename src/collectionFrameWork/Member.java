package collectionFrameWork;

import java.util.Collection;


public class Member {
    public Member() {}
    public Member(String membername) {
        this.memberID = numGenerator++;
        this.membername = membername;
    }

    private static int numGenerator = 100;
    private int memberID;
    private String membername;

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String toString() {
        return "회원번호 : " + memberID + "\n 회원 이름 : " + membername;
    }


}
