package classPart.about_static;
class Company{
    private static Company company = new Company();
    private Company() {} // 다른 클래스에서 생성자를 받아올 수가 음슴 여기서 만드는게 끝

    public static Company getInstance() {
        return company;
    }
}

//방어적인 패턴 싱글톤!
//생성자를 프라이빗으로 호출되지 못하게:ㅈㅂ

public class SIngleton {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);


    }
}
