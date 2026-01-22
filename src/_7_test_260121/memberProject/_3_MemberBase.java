package _7_test_260121.memberProject;

public abstract class _3_MemberBase {
    // 현재 여기 접근 지정은, 상속 받은 자식 클래스는 접근이 가능하지만,
    // 메인 클래스는 상속을 받지 않아서, 접근 불가능함. 그래서, 만약 필요시, 접근 하기 위해서는
    // getter 라는 메서드를 작성 해야함.
    // 260120_실습4_풀이, 순서5, getter 사용하는 부분 참고해야함.
    protected String name;
    protected String email;
    // 260120_실습4_풀이, 순서2, 패스워드 변수 추가
    protected String password;
    protected int age;

    // 260120_실습4_풀이, 순서3, 생성자 수정.
//    public _3_MemberBase(String name, String email, int age) {
    public _3_MemberBase(String name, String email,String password, int age) {
        this.name = name;
        this.email = email;
        // 260120_실습4_풀이, 순서4, 멤버 추가.
        this.password = password;
        this.age = age;
    }

    public abstract void showInfo(); // 정보 출력용 추상 메서드
    // 260120_실습4_풀이, 순서5, 이메일, 패스워드 조회 하는 기능 추가. getter
    // 생성시, 우클릭 -> 생성 -> Getter -> 각각, 하나씩, email, password 선택.
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서2-1
    // 생성시, 우클릭 -> 생성 -> Getter -> 각각, 하나씩, name, age 선택.

    public String getName() {
        return name;
    }
    // 260120_실습4_풀이_업그레이드_임시저장파일_추가, 순서2-2
    public int getAge() {
        return age;
    }

    // 260122_기능추가_수정_순서1
    // 외부에서, 해당 멤버 변수인, name,email,password,age 접근이 안됨.
    // 그래서, 우리는 외부에서 변경이 가능한 메서드 추가. setter 라고 부름.
    // 지금, 수동으로 만들지만, 나중에는 라이브러리 사용해서, 메모리상에 자동 생성 해줌.
    // 간단히 어노테이션을 이용해서요, <-- 요기법이 나중에 코드의 길이를 많이 줄여 줍니다.
    // 지금, 배우는 단계라서, 스쳐 지나가는 과정으로 생각하기.
    // 나중에는 더 쉽게 함.

    // 생성시, 우클릭 -> 생성 -> Setter -> 각각, 하나씩, email, password 선택.
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
