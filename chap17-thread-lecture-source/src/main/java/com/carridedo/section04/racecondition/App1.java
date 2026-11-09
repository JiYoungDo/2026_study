package com.carridedo.section04.racecondition;

public class App1 {

    // static 준다는건 공유하겠다는 의미
    static final int TIMES = 100000;

    public static void main(String[] args) throws InterruptedException {

        // 두 스레드가 함께 쓰는 공유 객체
        SharedCounter counter = new SharedCounter();

        // 스레드 하나가 할일 : 카운터를  Times 번 늘린다.
        Runnable unsafework = () ->{
            for(int i=0; i<TIMES; i++){
                counter.increment();
            }
        };


        Thread first = new Thread(unsafework);
        Thread second = new Thread(unsafework);
        first.start();
        second.start();

        System.out.println("join 없이 읽는 값 : " + counter.get());

        // 다음 실행에 영향을 주지 않도록 두 스레드가 끝날 때까지 기다린다.
        first.join();
        second.join();

        boolean neverOver =true;
        for(int i = 1; i<=3; i++){
            counter.reset();
            Thread t1 = new Thread(unsafework);
            Thread t2 = new Thread(unsafework);
            t1.start();
            t2.start();

            t1.join();
            t2.join();

            int value = counter.get();
            System.out.println("동기화 없음 " + i + "회 " +value);

            if(value>200000){
                neverOver = false;
            }
        }
        System.out.println("동기화 없음 값이 200000 이하 : " + neverOver);

    }
}
