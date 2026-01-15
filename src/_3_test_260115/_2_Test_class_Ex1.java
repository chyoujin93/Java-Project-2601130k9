package _3_test_260115;

public class _2_Test_class_Ex1 {
    public static void main(String[] args) {
        // 순서2, 클래스 사용
        // 1) 기본 생성자를 이용해서, 생성.
        // 객체 생성 방법 :
        // [클래스명] [참조형 변수이름(객체명,인스턴스라고 부름)] = new  [클래스명]();
        _2_Person lsy1 = new _2_Person();

        // 순서3, 복제인간 lsy1 에게, 이름 부여.
        // 연습용. 데이터에 직접 대입.
        // 나중에, 게터/세터라는 메서드를 이용할 예정.
        // 객체명 에, "." 을 찍어서, 해당 속성에 접근.
        lsy1.name = "이상용";

        // 순서4, 복제인간 lsy1의 기능 이용.
        // 함수 호출방법? 함수명()
        lsy1.sayHello();
    }
}
