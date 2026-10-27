package com.carriedo.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement1() {
        for(int i=1; i<=5; i++){
            if(i==3)continue;
            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2(){
        /*4의 배수이면서 5의 배수인 값 출력*/
        for(int i=1; i<=100;i++){
            if(i%4 !=0 || i%5!=0) continue;
            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement3(){
        for(int dan =2; dan<=9; dan++){

            System.out.println("==== "+dan+"단 ====");
            for(int su =1; su<=9; su++){
                if(su%2 ==0) continue;
                System.out.println(dan+"*"+su+"="+(dan*su));
            }
            System.out.println();
        }
    }


    // 언제 많이 사용되나? 값을 체크해서 정렬 및 중복 제거시 많이 사용.
    public void testJumpContinue(){
        labels:
        for(int dan =2; dan<=9; dan++){
            System.out.println("==== "+dan+"단 ====");
            for(int su =1; su<=9; su++){
                if(su%4 ==0) continue labels;
                System.out.println(dan+"*"+su+"="+(dan*su));
            }
            System.out.println();
        }
    }
}
