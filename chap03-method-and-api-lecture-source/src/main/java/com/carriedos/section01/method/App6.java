package com.carriedos.section01.method;

public class App6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String result = testMethod();
        System.out.println("result: " + result);
        System.out.println("main() 메소드 종료함");
    }

    public static String testMethod(){
        // String 타입의 값을 반환하고 매개변수가 없는 static 메소드.
        System.out.println("testMethod()메소드 실행함");
        return "test";
    }
}
