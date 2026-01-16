package _4_test_260116;

public class _4_AnimalMain_Ex {
    public static void main(String[] args) {
        _4_AnimalDog_Ex dog1 = new _4_AnimalDog_Ex();
        dog1.name = "멍멍이"; // 부모 클래스의 변수
        dog1.speak(); // 부모 클래스의 메서드 이용.
        dog1.bark(); // 자식 클래스의 (본인) 메서드
        System.out.println("dog1의 이름 : " + dog1.name);
    }
}
