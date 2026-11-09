package com.carridedo.section01.thread;

/**
 * Thread 클래스를 상속해 만든 스레드
 * - Tank 객체 자체가 스레드이므로 new Tank().start()로 바로 실행할 수 있다.
 * Thread를 상송했기 때문에 다른 클래스는 더이상 상속 못한다.
 * */
public class Tank extends Thread {

    /* Tank 스레드로 수행할 작업 내용을 작성*/

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Tank shooting");

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
