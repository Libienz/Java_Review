package inheritance;
// 점과 원 ? 이런 재사용만을 위한 관계는 상속으로는 쓰지 않아
// has a, is a 관계등을 생각해야됨 포함 연관 이런말인듯?
public class Customer {

    protected   int customerID;
    protected  String customerName;
    protected  String customerGrade;
    int bonusPoint;
    double bonusRatio;
/*
     public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }

 */


    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은" + customerGrade + "이며, 보너스" +
                "포인트는 " + bonusPoint +"입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

}
