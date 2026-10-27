package com.carriedo.section02.looping;

import java.util.Scanner;

public class C_while {
    //while 문 보통 파일.
    public void testSimpleWhileStatement(){
        for(int i=0; i<10; i++){
            System.out.println("출력 : "+i);
        }
        System.out.println();
        int i = 0;
        while (i<10){
            System.out.println("출력 : " +i);
            i++;
        }
    }

    public void testWhileExample(){
        // 반복횟수가 정해지지 않는 상태일 때 while문 사용
        Scanner sc  = new Scanner(System.in);
        String input = "";

        // 문자열 비교는 반드시 equals
        while(!input.equals("exit")){
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값 : " + input);
        }

        while(true){
            if(input.equals("exit")){break;}
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력받은 값 : " + input);
        }
    }

    public void testSimpleDoWhileStatement(){
        do{
            System.out.println("조건식이 false 여도 최초 한번은 무조건 동작함.");
        }while(false);
    }

}
