package com.carriedo.section02.looping;

import java.util.Scanner;

public class B_nestedfor {

    public void printGugudan(){
        System.out.print("🧡구구단 시작🧡");
        for(int i=2 ; i<10; i++){
            System.out.println("\n"+i+"단");
            for(int j=1; j<10; j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
        }
        System.out.println("\n🧡구구단 끝🧡");
    }

    public void printTriangleStar(){
        System.out.println("출력 줄 수 입력!");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){ //행
            for(int j=1;j<=i; j++) { //열
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
