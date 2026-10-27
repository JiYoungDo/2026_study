package com.carriedo.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();

        System.out.println("연산기호입력(+, -, *,/ ,%) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op){
            case '+': result = first+second; break;
            case '-': result = first - second; break;
            case '*':
            case 'x': result = first*second; break;
            case '/': result = first/second; break;
            case '%': result = first%second; break;
            default:
                System.out.println("입력한 기호 없어!");

        }

        System.out.println(result);
    }


    public void improveSwitchStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int first = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int second = sc.nextInt();

        System.out.println("연산기호입력(+, -, *,/ ,%) : ");
        char op = sc.next().charAt(0);

        /**
         * 2개 이상의 명령문을 작성해야 하는 경우 {}을 생락하지 못하고 작성해야 한다.
         * 반환 값을 yield라는 명령문을 작성하여 명시적으로 리턴한다.
         * */
        int result = switch(op){
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first+second;
            }
            case '-' -> first-second;
            case '*','X','x' -> first*second;
            case '/' -> first/second;
            case '%' -> first%second;
            default -> 0;
        };

        System.out.println(first+" "+op+" "+second+" = "+result);


    }
}
