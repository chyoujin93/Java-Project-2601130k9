package _11_test_260127.service;

import _11_test_260127.model._3_MemberBase;
import _11_test_260127.model._3_NormalMember;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 260127_리팩토링_코드정리_순서2
public class _3_MemberService {
    private static final String FILE_NAME = "members.txt";
    private Map<String, _3_MemberBase> members = new HashMap<>();
    private _3_MemberBase loggedInMember = null;


    // 생성자 생성(기본생성자)
    public _3_MemberService() {
        //생성시, 파일 로드, members.txt
//        미구현
//        loadMembers();
    }

    // 260127_리팩토링_코드정리_순서3
    // 모델 클래스 정리.
    // model 패키지(폴더), 파일 이동했다.

    // 상태 관련 메서드, 로그인한 멤버를 가져오기.
    public _3_MemberBase getLoggedInMember() {
        return loggedInMember;
    }

    //로그인한 멤버를 설정하기.
    public void setLoggedInMember(_3_MemberBase loggedInMember) {
        this.loggedInMember = loggedInMember;
    }

    // 로그인한 정보를 담고 있는 메모리상의 정보 Map 가져오기.
    // getter
    public Map<String, _3_MemberBase> getMembers() {
        return members;
    }

    // 260127_리팩토링_코드정리_순서4
    // 기존 기능들을 가져오기.
    // 회원가입
    public String join(String name, String email, String password, int age){
        if(members.containsKey(email)) {
            return "이미 가입된 이메일입니다.";
        }
        _3_NormalMember newMember = new _3_NormalMember(name, email, password, age);
        // 맵에 새 회원을 담는 과정,
        members.put(email, newMember);
        //  기존에 파일에 쓰기 기능.
        // 미구현
        saveMembers();
        return "success";

    }

    // 260127_리팩토링_코드정리_순서5
    // 파일 저장
    private void saveMembers() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            for (_3_MemberBase m : members.values()) {
                String line = m.getName() + "," + m.getEmail() + "," + m.getPassword() + "," + m.getAge();
                bw.write(line);
                bw.newLine(); // 줄바꿈 함.
            }
//            System.out.println("파일 저장 완료 " + FILE_NAME);

        } catch (IOException e) {
//            System.out.println("오류가 발생 했습니다. 원인: " + e.getMessage());
            // 변경, 파일을 분리해서, 기능이 없음.
            // 제거
//            printLog("오류발생 : " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("오류 발생, 파일 닫기 실패. ");
                }
            }

        }
    }

    // 목록조회
    // 로그아웃
    // 회원수정
    // 회원검색
    // 회원탈퇴
    // 종료
}
