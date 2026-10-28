package com.carriedo.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /** 사용자 정의 자료형 사용하기*/


        /** 변수 선언 및 객체 생성
         * 클래스명 변수명 = new 클래스명(); <-- 객체를 생성하는 구문이다.
         * 객체를 생성하게 되면 클래스에 정의한 필드(전역변수)와 메소드대로 객체가 heap 영역에 생성된다*/

        Member m1 = new Member(); //heap 공간에 객체를 생성했다 .(주소를 가지고 있다. )
        System.out.println("======>" + m1.hashCode());
        //JVM 이 넣어준다.
        /** 필드에 접근하기 위해 레퍼런스변수명.필드명으로 접근한다.
         * '.'은 참조연산자이며 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가진다.
         * heap 영역은 기본적으로 JVM 초기값으로 초기화 된다.*/

        System.out.println("m1.id = "+m1.id);
        System.out.println("m1.pwd = "+m1.pwd);
        System.out.println("m1.name = "+m1.name);
        System.out.println("m1.age = "+m1.age);
        System.out.println("m1.gender = "+m1.gender);
        System.out.println("m1.hobby = "+m1.hobby);

        m1.id="ididid";
        m1.pwd="pwpwpw";
        m1.name="naemnaem";
        m1.age=20;
        m1.gender ='M';
        m1.hobby = new String[]{"야구","코딩"};

        System.out.println("m1.id = "+m1.id);
        System.out.println("m1.pwd = "+m1.pwd);
        System.out.println("m1.name = "+m1.name);
        System.out.println("m1.age = "+m1.age);
        System.out.println("m1.gender = "+m1.gender);
        System.out.println("m1.hobby = "+ Arrays.toString(m1.hobby));

    }
}
