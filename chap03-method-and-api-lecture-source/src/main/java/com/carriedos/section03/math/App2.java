package com.carriedos.section03.math;

import java.util.Random;

public class App2 {
    public static void main(String[] args) {

        // Random() -> 00.0~ 1.0보다 작은 실수갑 리턴함.
        // (int)(Math.random()*구하려는 난수의 갯수)+구하려는 난수의 최소값

        int a= (int) (Math.random()*10);

        System.out.println("a = " + a);

        int b= (int) (Math.random()*10)+1;
        System.out.println("b = " + b);

        int c= (int) (Math.random()*6)+10;
        System.out.println("c = " + c);

        // ~128~127까지 난수
        int d= (int) (Math.random()*256)+(-128);
        System.out.println("c = " + c);


        Random random = new Random();
        int randomNum = random.nextInt(10); //0~9
        System.out.println("randomNum = " + randomNum);
        
        int randomNum2 = random.nextInt(10)+1; // 1~10
        System.out.println("randomNum2 = " + randomNum2);
        
        int randomNum3 = random.nextInt(26)+20; //20~45
        System.out.println("randomNum3 = " + randomNum3);
        
        int randomNum4 = random.nextInt(256)-128;
        System.out.println("randomNum4 = " + randomNum4);
    }
}
