package com.carriedos.section01.method;

public class App1 {
    public static void main(String[] args) {
        System.out.println("main 시작함");
        methodA(); // 같은 클래스 내의 static 메소드는 클래스명을 생략 가능.
    }

    public static void  methodA(){
        System.out.println("methodA다");
        methodB();
    }

    /**
     * method B summary , 이 서머리가 호출시 보임
     */
    public static void methodB(){
        System.out.println("methodB다");
        System.out.println("methodB 종료다");

    }

}
