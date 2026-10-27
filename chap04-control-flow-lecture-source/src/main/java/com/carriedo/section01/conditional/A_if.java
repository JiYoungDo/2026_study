package com.carriedo.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력해주세요");

        int num = sc.nextInt(); // 정수하나 받기.

        // 홀수인지 짝수인지 따라 프로그램 조절
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

        System.out.println("프로그램 종료");

    }


    public void testNestedIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 하나 입력 : ");
        int num = sc.nextInt();

        // 짝수인지 홀수인지, 음수인지 양수인지 체크용.
        if(num>0){
            if(num%2==0){
                System.out.println("even+");
            }else{
                System.out.println("odd+");
            }
        }else{
            if(num%2==0){
                System.out.println("even-");
            }else{
                System.out.println("odd-");
            }
        }

        System.out.println("프로그램 종료");
    }

}
