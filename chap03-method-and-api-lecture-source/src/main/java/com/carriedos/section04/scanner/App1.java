package com.carriedos.section04.scanner;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        System.out.println("나이 입력해라");
        int age  =sc.nextInt();
        System.out.println("age = " + age);

        // 실수값 받기
        System.out.println("키 입력해라");
        double height = sc.nextDouble();
        System.out.println("height = " + height);

        System.out.println("트루 올 폴스");
        boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = "+isTrue);

        System.out.println("주소 입력하시오");
        String address = sc.nextLine();
        System.out.println("address = " + address);

        //문자
        System.out.println("아무거나 입력");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);


    }
}
