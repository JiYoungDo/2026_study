package com.carriedo.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /** 추상화란?
         * 공통된 부분을 추출하고 공통되지 않고 불필요한 부분을 제거한다는 의미를 가지며, 추상화의 목적은 유연성 확보다
         * 유연성 확보란 여로곳에 적용할 수 있는 유연한 객체를 의미하며, 재상용성이 높아질 수 있게 한다는 의미다.
         *
         * 1.협력(애플리케이션에 구현에 필요한 객체간의 상호작용)
         * 2.책임(객체가 협력에 참여하기 위해 수행해야할 책임(기능))
         * 3.역할(객체의 책임이 모여 하나의 역할이 된다.)*/

        Scanner sc = new Scanner(System.in);
        CarRacer cr1 = new CarRacer(); // Application은 CarRacer을 소유한다.
        int  input =0;

        // multi line
        String menuText = """
                =========카레이싱 프로그래밍=========
                1.시동걸기
                2.전진
                3.정지
                4.시동끄기
                9.프로그램 종료
                메뉴선택: 
                """;

        do{
            System.out.print(menuText);
            input = sc.nextInt();
            switch (input){
                case 1:cr1.startUp();break;
                case 2:cr1.stepAccelator();break;
                case 3:cr1.stepBreak();break;
                case 4:cr1.turnOff();break;
                case 9:
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못선택함.");
            }

        }while(input != 9);

    }
}
