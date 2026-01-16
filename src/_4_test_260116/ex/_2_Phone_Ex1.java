package _4_test_260116.ex;
//실습2
//Phone` 클래스에서 **static 공유 멤버**를 활용한 설계 구조
//제조사 이름(manufacturer)
//모든 인스턴스가 공유해야 할 정보 : 예시)애플, 삼성,
//

public class _2_Phone_Ex1 {
    //Phone` 클래스에서 **static 공유 멤버**를 활용한 설계 구조
//제조사 이름(manufacturer)
    public static String manufacturer = "삼성";
    //멤버,
//접근 지정자 : private
//1) 모델 :String model
    private String model;
//2) 폰 넘버 :String phoneNumber
    private String phoneNumber;
//3) 생성자는 , 매개변수가 2개인 생성자

    public _2_Phone_Ex1(String model, String phoneNumber) {
        this.model = model;
        this.phoneNumber = phoneNumber;
    }

//4) 인스턴스 정보를 출력 메서드 하나 필요함 : printInfo()
    public void printInfo() {
        System.out.println("제조사 : " + _2_Phone_Ex1.manufacturer );
        System.out.println("모델명 : " + model); // 외부에서는 접근 x , 여기는 내부입니다. 접근 O
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("=====================================");
    }
    //인텔리 제이에서, 전체 검색 방법
    //1) shift 2번 , 검색창. 여기서 검색.

//5) static 메서드를 만들어서,
//제조사 이름을 변경하는 메서드, : changeManufacturer()
    public static void changeManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }
//

}
