package _4_test_260116.ex;

public class _2_PhoneMain_Ex1 {
    public static void main(String[] args) {
        //샘플 제품 3개 등록하고,
        _2_Phone_Ex1 phone1 = new _2_Phone_Ex1("갤럭시 s23","010-1234-5678");
        _2_Phone_Ex1 phone2 = new _2_Phone_Ex1("갤럭시 s24","010-2234-5678");
        _2_Phone_Ex1 phone3 = new _2_Phone_Ex1("갤럭시 s25","010-3234-5678");
        //샘플 제품 3개 정보 출력,
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();
        //제조사 이름 변경 후 조회 까지.
        _2_Phone_Ex1.changeManufacturer("애플");

        _2_Phone_Ex1 phone4 = new _2_Phone_Ex1("아이폰 14","010-4234-5678");
        _2_Phone_Ex1 phone5 = new _2_Phone_Ex1("아이폰 15","010-5234-5678");
        _2_Phone_Ex1 phone6 = new _2_Phone_Ex1("아이폰 16","010-6234-5678");
        //샘플 제품 3개 정보 출력,
        phone4.printInfo();
        phone5.printInfo();
        phone6.printInfo();

    }
}
