package com.carridedo.section03.sync;


/* 공유 데이터에 값을 소비하는 역할
* 생성자로 받은 Buffer에서 상품을 10번 꺼낸다.*/
public class Consumer extends Thread{

    // 생산자오 ㅏ같은 Buffer 객체를 가리킨다. 여러 스레드가 함께 쓰므로 critical(임계) 데이터라고부른다.
    private final Buffer criticalData;

    public Consumer(Buffer criticalData){
        this.criticalData = criticalData;
    }

    public void run(){
        for(int i=0; i<10; i++){
            criticalData.getData();
            //0.1초 쉬면서 생산자 스레드가 실행될 틈을 만든다.
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }

}
