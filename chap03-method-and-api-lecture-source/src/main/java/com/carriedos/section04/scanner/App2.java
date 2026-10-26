package com.carriedos.section04.scanner;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자입력 : ");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        sc.nextLine(); // nextInt()가 읽어가지 않은 개행 문자를 입력 버퍼에서 ㅇ릭어서 버린다.

        System.out.println("문자열 입력 : ");
        String str = sc.nextLine();

        System.out.println("str = " + str);
    }

}
