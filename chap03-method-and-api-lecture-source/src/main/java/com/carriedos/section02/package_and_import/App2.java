package com.carriedos.section02.package_and_import;

import com.carriedos.section02.package_and_import.test.Clac;

import static com.carriedos.section02.package_and_import.test.Clac.maxNumbersOf;
import static com.carriedos.section02.package_and_import.test.Clac.minNumbersOf;

public class App2 {
    public static void main(String[] args) {
        Clac cal = new Clac();
        int result = cal.plpustTwoNubers(30,30);
        System.out.println("result =  "+result);

        // 패키지가 다르지만 클래스명이 같은 경우일때는
        // import 구문을 중첩해서 사용하지 못하니 풀패키지명.클래스명으로 사용해야 한다.
        com.carriedos.section01.method.Clac calculator
                = new com.carriedos.section01.method.Clac();

        int result2 = calculator.plpustTwoNubers(10,20);
        System.out.println("result2 ="+result2);

        //static 메소드 사용방법
        int result3 =Clac.maxNumbersOf(10,30); // 클래스명으로 시작
        System.out.println("result3 = " + result3);

        int result4 = maxNumbersOf(10,30); // import static 을 이용
        System.out.println("result4 = " + result4);
        int result5 = minNumbersOf(10,30);
        System.out.println("result5 = " + result5);
    }
}
