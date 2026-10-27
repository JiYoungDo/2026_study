package com.carriedo.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testIfelseIfStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.print("학생이름 : ");
        String name  = sc.nextLine();
        System.out.print("학생성적 : ");
        int score = sc.nextInt();

        String grade ="";

        if(score>=90){
            //A
            grade = "A";
        } else if (score >=80) {
            //B
            grade = "B";
        } else if (score >=70) {
            //C
            grade = "C";
        } else if (score >=60) {
            //D
            grade = "D";
        }else{
            //F
            grade = "F";
        }

        System.out.println(name + "학생은 "+ grade + "입니다");
    }

    public void testNestedIfElseIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();

        String grade = "";
        if (score >= 90) {
            grade = "A";
            if(score >=95) grade+="+";
        } else if (score >= 80) {
            grade = "B";
            if(score >=85) grade+="+";
        }  else if (score >= 70) {
            grade = "C";
            if(score >=75) grade+="+";
        }  else if (score >= 60) {
            grade = "D";
            if(score >=65) grade+="+";
        } else {
            grade = "F";
        }


        System.out.println(name + " 학생의 점수는 " +
                score + " 점이며 학점은 " + grade + "입니다.");

    }

}
