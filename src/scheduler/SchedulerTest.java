package scheduler;

import java.io.IOException;
import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 배분 방식을 선택하게요. R, L, P");

        Scanner sc = new Scanner(System.in);
        //int ch = System.in.read();
        char ch = sc.next().charAt(0);
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("지원하지 않는 기능입니당.");
        }
        scheduler.getNextCall();
        scheduler.setCallToAgent();
    }

    //JDBC 자바가 데이터베이스랑 연동이 되려면 필요한것들이 명세가 되어있는
    //Connection Statement 등등...  전부 인터페이스
    //이거의 구현은 Oracle에서 한다 또는 mssql mysql ...
    //우리한테 .jar파일을 준다.
}
