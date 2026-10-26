package com.carriedos.section02.package_and_import;

import com.carriedos.section02.package_and_import.test.Clac;

// import 구문을 사용하지 않을 때, 풀 패킥지명, 클래스명으로 직접 다 기입을 해줘야 한다.
public class App1 {
    public static void main(String[] args) {
        
        Clac calc = new Clac();
        int i = calc.plpustTwoNubers(10, 20);

        System.out.println();
    }
}
