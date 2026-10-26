package com.ohgiraffers.section06.ternary;

public class App1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1>0)? "양수다":"양수가아니다";
        String result2 = (num2 >0)? "양수다":"양수가아니다";

        System.out.println("num1은 " + result1);
        System.out.println("num2은 " + result2);

        /*ㅈㅜㅇㅊㅓㅂㅅㅏㅇㅛㅇㄷㅗ ㄱㅏㄴㅡㅇㅎㅏㄷㅏ.*/
        int num3 = 5;
        int num4 = 0;
        int num5 = -6;
        String result3 = (num3>0)? "양수다": (num3 ==0)?"0이다" :"음수다";
    }
}
