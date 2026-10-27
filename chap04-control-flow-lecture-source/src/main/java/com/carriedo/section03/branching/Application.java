package com.carriedo.section03.branching;

public class Application {
    public static void main(String[] args) {

        A_break ab = new A_break();
        //ab.testSimpleBreakStatement();
        // ab.testSimpleBreakStatement2();


        B_continue bc = new B_continue();
        // bc.testSimpleContinueStatement1();
        // bc.testSimpleContinueStatement2();
        // bc.testSimpleContinueStatement3();
        bc.testJumpContinue();
    }
}
