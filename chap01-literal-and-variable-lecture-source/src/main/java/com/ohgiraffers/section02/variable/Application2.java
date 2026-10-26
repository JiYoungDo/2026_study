package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        // 1.정수를 취급하는 자료형
        // 변수 선언 - [자료형 변수명]

        byte bNum; // 1byte
        short sNum; // 2byte
        int iNum;  //4byte (기본)
        long lNum; // 8byte

        // 2. 실수를 취급하는 자료형
        float fNum; // 4byte
        double dNum; // 8byte (기본)

        //3. 문자취급 자료
        char ch; // 2byte

        // 4. 논리값
        boolean isTrue; // 1byte

        // ---- 여기까지 기본자료형 -- --\


        // 5. 문자열을 취급하는 자료형(참조자료형)
        // 다른점, 대문자로 시작, 정해진 크기는 없으나 대략적으로 4byte로 시작.
        // 자바에서 대문ㄴ자로 시작하는건 클래스 밖에 없다.
        String str ;   // 4byte



        // 자료형별 초기화
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 8888888L; // long 형에 대입되는 값은 L을 붙인다. L은 소문자여도 된다. 다만 개발자 헷갈릴까봐 암묵적으로 대문자로씀.

        fNum= 3.14f; // ⭐️f 안 붙이면 실수기본자료형인 double로 됨. 대입 연산자의 기준이 여기서 또 나오는 거. (왼쪽오른쪽 항상 동일해야 함) . 소문자로.
        dNum = -3.14;

        ch ='a';
        ch = 97; // 0~65535

        isTrue = true;





    }

}
