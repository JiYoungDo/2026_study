package com.carriedo.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 기본생성자가 기본적으로 생략되어있다. 컴파일시에 컴파일러가 자동으로 넣어준다.*/

    /* 기본 생성자
    접근제한자 클래스명([매개변수]) {}

    메소드의 형태를 띄지만 특이하게도 반환형이 없는 메소드
    * */
    public User(){
        System.out.println("🎃 User 기본 생성자 동작 🎃");
    }; // 기본생성자.

    public User(String id, String pwd){
        this.id = id;
        this.pwd = pwd;

        System.out.println("🎃 User id,pwd 초기 생성자 동작 🎃");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
        //this.id = id;
        //this.pwd = pwd;
        this(id,pwd); /**🔥 동일 클래스내 다른 생성자 메소드 호출하는 구문/ 무조건 첫줄에있어야 하며, 개수와 타입을 봐야함.**/

        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("🎃 User 모든필드 초기화 생성자 동작 🎃");
    }

    /*매개 변수 생성자*/
    public String getInfo(){
        return "id 👻:"+id+"   pwd 👻:"+pwd +"   name 👻:"+name + "   enrollDate 👻:"+ enrollDate;
    }


}
