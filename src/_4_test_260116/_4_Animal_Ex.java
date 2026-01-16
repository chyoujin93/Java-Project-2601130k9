package _4_test_260116;

public class _4_Animal_Ex {
    // 부모클래스
    // 접근지정자, 자식 클래스에서 접근 가능. 일반 클래스 접근 불가
    protected String name;

    // static 없으면, "인스턴스 메서드"라고 부름. 객체를 생성해서 호출해야함.
    // static 있으면, "클래스 메서드"라고 부름. 객체 생성없이, 클래스명으로 호출.
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}
