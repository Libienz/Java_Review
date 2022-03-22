package exception;

public class IDFormatTEst {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException { //메소드 밖 즉 사용할 쪽에서 핸들링 해라
        if (userID == null) {
            throw new IDFormatException("아이디는 null이 될 수 없습니다.");
        }
        else if (userID.length() < 8 || userID.length() >20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }

    public static void main (String[] args) {

        IDFormatTEst idTEst = new IDFormatTEst();
        try {
            idTEst.setUserID(null);
        }
        catch (IDFormatException e) {
            System.out.println(e);
        }

    }
}
