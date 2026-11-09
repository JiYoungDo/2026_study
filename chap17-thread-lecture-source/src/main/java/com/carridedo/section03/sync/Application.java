package com.carridedo.section03.sync;

public class Application {


    /** 동기화화 wait/notify: 생성자, 소비자
    * 생산자(Producer), 소비자(Consumer) 두 스레드가 Buffer라는 객체 하나를 함께 쓴다.
     * - Buffer 는 상품을 한개만 담을 수 있다.
     * 생성자는 비어 있을 때만 넣고, 소비자는 채워져 있을 떄만 꺼낸다.
     * 조건이 맞지 않으면 wait()로 기다리고, 상대가 일을 마치면 notify()로 깨워준다.
    */
    public static void main(String[] args) {
        // 두 스레드에 같은 Buffer 객체를 넘겨야지 서로 주고 받을 수 있다.
        Buffer buffer = new Buffer();

        Thread b1 = new Producer(buffer);
        Thread b2 = new Consumer(buffer);


    }
}
