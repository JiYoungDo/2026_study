package com.ohgiraffers.section03.constant;

public class App1 {
    public static void main(String[] args) {
        // final 이라는 단어
        final int AGE; // 상수의 변수명은 대문자로 표기(암묵적)
        AGE = 18;


        //1. 모든 문자는 영문자 대문자 혹은 숫자만 사용

        //2. 단어와 단어 연결은 언더스코어(_)를 사용, 관례상 카멜케이스 표기법으로도 안 씀.
        final int MAX_AGE = 60;
    }
}
