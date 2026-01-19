package _5_test_260119.ex;

public class _1_B_Ex1 extends _1_A_Ex1 {
    // 자식클래스
    public _1_B_Ex1() {
//        부모 클래스의 생성자 호출 부분 생략 부분 확인.
        // 아래 super() 주석을 해제후, ctrl 누른 상태에서 클릭시
        // 부모 클래스로 이동함.
//        super();
        System.out.println("_1_B_Ex1 (자식)클래스 생성자 ");
    }

    @Override
    public void show() {
        System.out.println("자식 show 기능입니다.");
    }
}
