package com.carridedo.section03.sync;

/** 공유 데이터에 값을 생산하는 역할*/
// Thread를 상속한 클래스로, 생산자로 받은 Bufferdp 1번부터 10까지 상품을 넣는다.
public class Producer extends Thread{
    // 소비자와 같은 Buffer객체를 가리킨다.
    private final Buffer criricalData;

    public Producer(Buffer criricalData) {
        this.criricalData = criricalData;
    }

    @Override
    public void run() {
        for(int i =0; i<=10; i++){
            criricalData.setData(i); //Buffer클래스에서 정의한 생산하는 기능의 메서드 호출
            //0.1초 쉬어서 소비자 스레드가 실행할 틈을 만들어 준다.
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
