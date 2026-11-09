package com.carridedo.section01.thread;

import javax.swing.*;

public class Application {
    /**
     * Thread를 생성하는 방법
     * 1. Thread 클래스 상속
     * 2. Runnable 인터페시르를 구현
     * */
    public static void main(String[] args) {
        Thread t1 = new Car(); // Tjread
        Thread t2 = new Tank(); // Thread
        Thread t3 = new Thread(new Plane()); //Runnable

        System.out.println("t1 우선순위 : " + t1.getPriority());
        System.out.println("t2 우선순위 : " + t2.getPriority());
        System.out.println("t3 우선순위 : " + t3.getPriority());

        t2.setPriority(Thread.MAX_PRIORITY); //10
        t3.setPriority(Thread.MIN_PRIORITY); //1

        System.out.println("t1 우선순위 : " + t1.getPriority());
        System.out.println("t2 우선순위 : " + t2.getPriority());
        System.out.println("t3 우선순위 : " + t3.getPriority());

        // run() 메소드는
//        t1.run();
//        t2.run();
//        t3.run();

        // start()메소드는 호출시 별도의 호출 스택을 생성하여 각각의 스레드가 동장
        t1.start();
        t2.start();
        t3.start();

    }
}
