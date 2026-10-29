package com.carriedo.section03.dto;

// 사용자 관련된 기능 모음
public class UserService {

    public String login(LoginDto loginDto){
        // DB 없으니 임의의 아이디와 비밀번호로 대조한다.
        String dbId ="user01";
        String dbpw = "pass01";
        String result = "";

        if(loginDto.getId().equals(dbId)){
            if(loginDto.getPwd().equals(dbpw)){
                result = "로그인 성공";
            }
        }else{
            result = "다시 입력하세요";
        }

        return result;
    }
}
