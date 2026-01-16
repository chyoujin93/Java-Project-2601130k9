package _4_test_260116;

public class _1_Test_array_class_EX {
    public static void main(String[] args) {
        //3명의 학생 정보를 저장하는
        // `Student` 객체 배열을 만들고
        // 이름을 출력하시오.
        _1_Student[] arr = {
                new _1_Student("지민"),
                new _1_Student("정국"),
                new _1_Student("태형"),
        };

        // 반복문을 이용해서, 출력 해보기.
        for(_1_Student s: arr) {
            System.out.println(s.name);
        }

    }
}
