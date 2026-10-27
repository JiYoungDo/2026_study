package com.carriedo.section01.conditional;

public class Application {

    //실행용 메소드
    public static void main(String[] args) {

        //if문 테스트
        A_if a = new A_if();

       // a.testSimpleIfStatement();

       // a.testNestedIfStatement();

        C_ifElseif c = new C_ifElseif();
        // c.testIfelseIfStatement();
        // c.testNestedIfElseIfStatement();

        D_switch d = new D_switch();
        d.testSimpleSwitchStatement();
    }
}
