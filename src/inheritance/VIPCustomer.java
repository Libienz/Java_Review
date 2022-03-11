package inheritance;

public class VIPCustomer extends Customer{
    protected int agentID;
    private double saleRatio;
//package private이 오히려 protected 보다 가시성이 낮음! 다른 패키지에 있어도
    // 상속관계라면 문제없다.

    //하위클래스를 생성할때 상위 클래스의 콘스트럭터가 먼저 호출된다!?
    //컴파일러가 super();를 넣어주기 때문
    //디폴트 컨스트럭터를 호출한다.
    //상위 클래스에서도 super라는게 생략되어있긴 매한가지 왜냐하면 object로부터
    //상속 받았기 때문
    //상위클래스에 private한 멤버변수가 있어도 쓸 수 없는거지 힙메모리 상엔 잡힌다.

    public VIPCustomer(int customerID, String customerName,int agentID) {
        super(customerID,customerName);
        this.bonusRatio = 0.05;
        this.saleRatio = 0.1;
        this.customerGrade = "VIP";
        this.agentID = agentID;
    }


    public int getAgentID() {
        return agentID;
    }

    //오버라이드 되서 재정의 되지 않으면 부모께 불리지만
    //재정의 될 경우에는 어떤 것을 부르느냐?
    //상위 클래스로 업캐스팅이 되어도 인.스.턴.스의 메소드가 불린다!!! 이게 다형성
    //하나의 코드가 다양한 역할을 할 수가 있음음
   @Override
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원아이디는 " + agentID + "입니다";
    }
}
