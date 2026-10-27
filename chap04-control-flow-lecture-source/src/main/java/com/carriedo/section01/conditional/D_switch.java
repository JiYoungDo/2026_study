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
            case '*': result = first*second; break;
            case '/': result = first/second; break;
            case '%': result = first%second; break;
            default:
                System.out.println("입력한 기호 없어!");

        }

        System.out.println();
    }

}
