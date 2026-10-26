package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args){

        //  정수와 정수의 연산은 항시 정수다
        System.out.println("정수연산");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); // 몫
        System.out.println(123 % 10); // 나머지

        System.out.println("실수연산");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);	//약간의 오차가 생긴다. 소수계산이 들어가서 1.099999이런식으로 내부적으로 값이 있음.


        System.out.println("정수, 실수 연산 결과는 항상 실수다./ 실수가 더 크드ㅏ.");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        // 문자는 내부적으로 숫자이기 때문에
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');


        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        // 문자와 실수연산도 가능~
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 문자열 리터럴 연산 , 문자열은 사칙 연산 중 + 연산만 가능. 연산결과는 이어붙이기가 됨.
        // 문자열로 시작하고 뒤에 어떤 리터럴 값이 와도 ㅁ결과는 문자열.
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");

        // 논리연산은 모든 사ㅈ칙연산이 안된다. 가능한건 논리값과 문자열의 +연산만 가능!

    }

}
