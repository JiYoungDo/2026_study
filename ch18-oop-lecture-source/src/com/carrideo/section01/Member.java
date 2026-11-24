package com.carrideo.section01;

/* 헬스장 회원 한명을 나타내는 클래스 */
public class Member {
    String name;
    int count;

    public void enter(){
        count-=1;
        System.out.println(name +"입장, 남은 횟수 : "+count);
    }
}
