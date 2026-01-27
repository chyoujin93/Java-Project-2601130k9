package _11_test_260127.memberProject.memberProject.model;

public class _3_NormalMember extends _3_MemberBase implements _3_Joinable {
    // 매개변수가 3개인 생성자

    // 260120_실습4_풀이, 순서6, 생성자를 수정, 부모 클래스의 멤버 password 추가 되어서,
//    public _3_NormalMember(String name, String email, int age) {
//        super(name,email,age);
//    }

    // 기본 생성자 추가.


    public _3_NormalMember() {
        super();
    }

    public _3_NormalMember(String name, String email, String password , int age) {
        super(name,email,password,age);
    }

    // Joinable 인터페이스의 메서드를 재정의,
    @Override
    public void join() {
        System.out.println(name + "님 회원가입 완료.");
    }
    // 추상 클래스의 , 추상 메서드를 반드시 구현하기.
    @Override
    public void showInfo() {
        System.out.println("이름 : " +name);
        System.out.println("이메일 : " +email);
        System.out.println("나이 : " +age);
    }
}
