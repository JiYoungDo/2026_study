package com.carriedos.section03.math;

public class App1 {
    public static void main(String[] args) {

        int asbs = Math.abs(3);
        System.out.println("args = " + asbs); //import 가 없는 이유, 컴파일러가 넣어주니까.

        System.out.println("더 작은 값" +Math.min(10,20));
        System.out.println("더 작은 값" +Math.max(10,20));
        System.out.println(Math.random());
    }
}
