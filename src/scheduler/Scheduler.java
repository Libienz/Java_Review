package scheduler;

public interface Scheduler {
    void getNextCall();
    void setCallToAgent();
    default void print() {System.out.println("");} //디폴트 메소드는 구현 가능

}
