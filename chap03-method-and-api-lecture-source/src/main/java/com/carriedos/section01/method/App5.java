package com.carriedos.section01.method;

public class App5 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        new App5().testMethod();

        System.out.println("main() 메소드 종료함");
    }

    public void testMethod(){ // 반환값도 없고, 매개변수도 없는  non-ststic method
        System.out.println("testMethod() 동작 확인");
        return; //메소드가 호출한 곳으로 돌아가기 위해서는 return을 필요로 하나, 작성 안해도 컴파일러가 자동으로 추가해줌.
    }
}
