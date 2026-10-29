package com.carriedo.section03.dto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /** 데이터를 추상화하는 기법*
         * DTO : 계층간의 데이터 전달(전송) 용도로 사용되는 클래스
         * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 으미 없을 정도로
         * 필드명을 그대로 사용한 setter, getter 메소드로 인해 유지보수성이 좋지는 않다.
         */

        MemberDto memberDto = new MemberDto();
        memberDto.setAge(1);
        memberDto.setName("홍길동");
        memberDto.setNumber(1);
        memberDto.setGender('M');
        memberDto.setHeight(160.3);
        memberDto.setWeight(12.3);
        memberDto.setActivated(true);

        System.out.println(memberDto.getAge());
        System.out.println(memberDto.getGender());
        System.out.println(memberDto.getName());
        System.out.println(memberDto.getHeight());
        System.out.println(memberDto.getWeight());
        System.out.println(memberDto.getNumber());
        System.out.println(memberDto.getNumber());
        System.out.println(memberDto.isActivated());

        testMethod1(memberDto);
        MemberDto memberDto1 = getMemberDto(memberDto);
        System.out.println(memberDto1.getNumber());


        System.out.println("🦁 Login TEST 🦁");
        /** 1. 아이디와 비밀번호를 사용자에게 입력받는다.
         * 2. 일치하면 "로그인 성고" 문구 출력
         * 3. 불일치시 "다시 입력" 문구 출력**/
        Scanner sc= new Scanner(System.in);
        System.out.print("아이디 : ");
        String inputid = sc.nextLine();
        System.out.print("비번 : ");
        String inputpw = sc.nextLine();

        LoginDto loginDto = new LoginDto(inputid,inputpw);

        UserService userService = new UserService();
        System.out.println(userService.login(loginDto));


    }

    public static void testMethod1(MemberDto membeDto){
        System.out.println("================>"+membeDto.getNumber());
    }

    public static MemberDto getMemberDto(MemberDto memberDto){
        memberDto.setNumber(999);
        return memberDto;
    }
}
