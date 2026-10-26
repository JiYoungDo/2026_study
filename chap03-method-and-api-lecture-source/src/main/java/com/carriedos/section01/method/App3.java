package com.carriedos.section01.method;

public class App3 {
    // 전역
    static int global = 10;  // 클래스(static) 변수
    public static void main(String[] args) {
        // 지역
        int local = 20; // 지역변수
        System.out.println("global = " +global);
        System.out.println("local = " +local);
        test(local);

        // static 없는 메소드 호출
        // 클래스명 변수명 = new 클래스명();
        App3 app3 = new App3();

        app3.testMethod(22); // 타입에 맞는 값을 그대로 입력하는 방법
        app3.testMethod(local); // 타입에 맞는 변수를 이용해서 입력하는 방법
        double dAge = 12.35;
        app3.testMethod((int)dAge); // 형변환
    }

    public static void test(int a){
        System.out.println("global = " +global);
        System.out.println("local = " +a);
    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다. ");

    }


}
