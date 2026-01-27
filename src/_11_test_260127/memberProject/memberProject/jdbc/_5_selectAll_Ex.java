package _11_test_260127.memberProject.memberProject.jdbc;

import _11_test_260127.memberProject.memberProject.model._3_MemberBase;
import _11_test_260127.memberProject.memberProject.model._3_NormalMember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class _5_selectAll_Ex {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("연습용으로 members 테이블에 데이터 전체 조회 예제 확인. ");
        //드라이버 로딩.

        // 반복1
        // 순서1, 드라이버 로드, 자바 -> 오라클로 쿼리 를 전달하기 위한 도구 모음집을 메모리에 로드
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 전체 데이터 조회 해보기.
        List<_3_MemberBase> members = selectAllMembers();
        // 콘솔에 출력해보기.
        for(_3_MemberBase member :members) {
            System.out.println("이름 : " + member.getName());
            System.out.println("이메일 : " + member.getEmail());
            System.out.println("나이 : " + member.getAge());
            System.out.println("패스워드 : " + member.getPassword());
        }
    }

    // 전체 조회 기능 추가.
    public static List<_3_MemberBase> selectAllMembers() {
        List<_3_MemberBase> list = new ArrayList<>();
        String sql = "SELECT * FROM members ORDER BY name ASC"; // 이름순 정렬

        try (//1, 고정2
             Connection conn = getConnection(
                     "jdbc:oracle:thin:@localhost:1521:xe",
                     "scott",
                     "tiger");// 회원 추가 기능에서, 같은 코드 재사용.

             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // 데이터가 여러 줄이므로 while문 사용
            while (rs.next()) {
                _3_MemberBase dto = new _3_NormalMember();
                // DB에서 꺼내서 DTO 객체에 담기
                dto.setName(rs.getString("name"));
                dto.setEmail(rs.getString("email"));
                dto.setPassword(rs.getString("password"));
                dto.setAge(rs.getInt("age"));

                // 리스트에 추가
                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list; // 완성된 리스트 반환
    }
}
