package com.ohgiraffers.section04.overflow;

public class App1 {
    public static void main(String[] args) {

        // 오버플로우 ( 큰수에서 작은수로 바뀔때)
        byte num1 = 127;
        System.out.println("num1 : " + num1);						      //127 : byte의 최대 저장 범위

        num1++;														                    //1 증가
        System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위


        // 언더 플로우 (가장 최소 범위에서 가장 큰 범위로 바뀌는)
        byte num2 = -128;
        System.out.println("num2 : " + num2);						      //-128 : byte의 최소 저장 범위

        num2--;														                    //1 감소
        System.out.println("num2 underflow : " + num2);				//127 : byte의 최대 저장 범위

    }
}
