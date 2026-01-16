package _4_test_260116;

public class _3_2_BankAccountMain_Ex {
    public static void main(String[] args) {
        // 계좌를 개설하는 고객이 3명,
        // 각 3명의 이름을 설정하고,
        _3_2_BankAccount_Ex client1 =
                new _3_2_BankAccount_Ex("고객1");
        client1.info();
        _3_2_BankAccount_Ex client2 =
                new _3_2_BankAccount_Ex("고객2");
        client2.info();
        _3_2_BankAccount_Ex client3 =
                new _3_2_BankAccount_Ex("고객3");
        client3.info();
        // 전체 계좌가 몇개 개설 되었는지
        // 공유자원인 static 으로 선언된 변수를 확인.
        // static 은 접근시, 클래스명으로 점을 찍어서 접근.
        // 메서드, 변수도 똑같이 클래스명으로 접근.
        _3_2_BankAccount_Ex.showInfo();

    }
}
