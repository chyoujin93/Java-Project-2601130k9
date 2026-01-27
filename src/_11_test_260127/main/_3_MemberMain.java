package _11_test_260127.main;

import javax.swing.*;

// 260127_리팩토링_코드정리_순서1
public class _3_MemberMain {
    public static void main(String[] args) {
        // 260127_리팩토링_코드정리_순서2
        // 스윙의 기능이용해서, 스래드 이용하기.
        // [GUI 변경] 메인 스레드에서 GUI 실행,
        SwingUtilities.invokeLater(() -> {
            // 1. 기능 구현 클래스 (서비스) 객체생성
            //_3_MemberService, 미구현
//            new _3_MemberService();

            //2. 화면 클래스(UI) 객체생성 및 서비스 주입.
           // _3_MemberUI, 미구현
//            new _3_MemberUI(service);
        });
    }
}
